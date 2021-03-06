# biotools-3.0.0-rc-rev1

biotoolsSchema is a formalised XML schema (XSD) which defines a description model for bioinformatics software.  It can be used to describe bioinformatics tools - application software with well-defined data processing functions (inputs, outputs and operations).   This includes simple tools with one or a few closely related functions, and complex, multimodal tools with many functions, tools available available for immediate use as online services, or in a form which which you can download, install, configure and run yourself.  

biotoolsSchema defines 50 important scientific, technical and administrative attributes.  It concentrates upon the salient common features, with a highly minimal core of 3 attributes (tool name, homepage URL and short description).

 biotoolsSchema can help to support the cataloguing and discovery of software and is used by the [ELIXIR Tools & Data Services Registry](https://bio.tools).

File | Description
---- | -----------
biotools-3.0.0-rc-rev1.xsd | XML schema
docs/biotools-3.0.0-rc-rev1.html | Full schema documentation
example_files/biotools-3.0.0-rc-rev1.xml | Sample XML format file, including all non-mandatory elements and including 2 elements if marked as repeatable in the schema.
example_files/biotools-3.0.0-rc-rev1_mandatoryFieldsOnly.xml | Sample XML format file, including only mandatory elements and including only 1 element if marked as repeatable in the schema.



