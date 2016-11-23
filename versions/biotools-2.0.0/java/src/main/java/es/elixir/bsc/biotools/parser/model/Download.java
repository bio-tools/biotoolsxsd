/**
 * *****************************************************************************
 * Copyright (C) 2016 ELIXIR ES, Spanish National Bioinformatics Institute (INB)
 * and Barcelona Supercomputing Center (BSC)
 *
 * Modifications to the initial code base are copyright of their respective
 * authors, or their employers as appropriate.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 *****************************************************************************
 */

package es.elixir.bsc.biotools.parser.model;

/**
 * 
 * @author Dmitry Repchevsky
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "", propOrder = {"urlFtpType",
                                 "downloadType",
                                 "comment",
                                 "diskFormat",
                                 "containerFormat",
                                 "CMD"})
public class Download {
    
    private UrlFtpType url;
    private DownloadType type;
    private TextType comment;
    private DiskFormatType diskFormat;
    private ContainerFormatType containerFormat;
    private TextType cmd;
    
    @XmlElement(name = "url")
    public UrlFtpType getUrlFtpType() {
        return url;
    }
    
    public void setUrlFtpType(UrlFtpType url) {
        this.url = url;
    }
    
    @XmlElement(name = "type")
    public DownloadType getDownloadType() {
        return type;
    }
    
    public void setDownloadType(DownloadType type) {
        this.type = type;
    }
    
    public TextType getComment() {
        return comment;
    }
    
    public void setComment(TextType comment) {
        this.comment = comment;
    }
    
    public DiskFormatType getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(DiskFormatType diskFormat) {
        this.diskFormat = diskFormat;
    }

    public ContainerFormatType getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(ContainerFormatType containerFormat) {
        this.containerFormat = containerFormat;
    }
    
    @XmlElement(name = "cmd")
    public TextType getCMD() {
        return cmd;
    }
    
    public void setCMD(TextType cmd) {
        this.cmd = cmd;
    }
}