package typingsJapgolly.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDocumentOutputConfig extends StObject {
  
  /**
    * Google Cloud Storage destination for output content. For every single input document (for example, gs://a/b/c.[extension]), we generate at most 2 * n output files. (n is the # of
    * target_language_codes in the BatchTranslateDocumentRequest). While the input documents are being processed, we write/update an index file `index.csv` under
    * `gcs_destination.output_uri_prefix` (for example, gs://translation_output/index.csv) The index file is generated/updated as new files are being translated. The format is:
    * input_document,target_language_code,translation_output,error_output, glossary_translation_output,glossary_error_output `input_document` is one file we matched using
    * gcs_source.input_uri. `target_language_code` is provided in the request. `translation_output` contains the translations. (details provided below) `error_output` contains the error
    * message during processing of the file. Both translations_file and errors_file could be empty strings if we have no content to output. `glossary_translation_output` and
    * `glossary_error_output` are the translated output/error when we apply glossaries. They could also be empty if we have no content to output. Once a row is present in index.csv, the
    * input/output matching never changes. Callers should also expect all the content in input_file are processed and ready to be consumed (that is, no partial output file is written).
    * Since index.csv will be keeping updated during the process, please make sure there is no custom retention policy applied on the output bucket that may avoid file updating.
    * (https://cloud.google.com/storage/docs/bucket-lock#retention-policy) The naming format of translation output files follows (for target language code [trg]): `translation_output`:
    * gs://translation_output/a_b_c_[trg]_translation.[extension] `glossary_translation_output`: gs://translation_test/a_b_c_[trg]_glossary_translation.[extension] The output document
    * will maintain the same file format as the input document. The naming format of error output files follows (for target language code [trg]): `error_output`:
    * gs://translation_test/a_b_c_[trg]_errors.txt `glossary_error_output`: gs://translation_test/a_b_c_[trg]_glossary_translation.txt The error output is a txt file containing error
    * details.
    */
  var gcsDestination: js.UndefOr[GcsDestination] = js.undefined
}
object BatchDocumentOutputConfig {
  
  inline def apply(): BatchDocumentOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDocumentOutputConfig]
  }
  
  extension [Self <: BatchDocumentOutputConfig](x: Self) {
    
    inline def setGcsDestination(value: GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
