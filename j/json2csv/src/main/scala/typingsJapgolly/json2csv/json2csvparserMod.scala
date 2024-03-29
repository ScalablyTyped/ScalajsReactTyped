package typingsJapgolly.json2csv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object json2csvparserMod {
  
  @JSImport("json2csv/JSON2CSVParser", JSImport.Namespace)
  @js.native
  open class ^[T] () extends JSON2CSVParser[T]
  
  @js.native
  trait JSON2CSVParser[T]
    extends typingsJapgolly.json2csv.json2csvbaseMod.^[T] {
    
    /**
      * Main function that converts json to csv.
      *
      * @param data Array of JSON objects to be converted to CSV
      * @returns The CSV formated data as a string
      */
    def parse(data: T): String = js.native
    def parse(data: js.Array[T]): String = js.native
    
    /**
      * Preprocess the data according to the give opts (unwind, flatten, etc.)
      * and calculate the fields and field names if they are not provided.
      *
      * @param data Array or object to be converted to CSV
      * @returns Preprocessed data ready to be processed
      */
    /* protected */ def preprocessData(data: T): js.Array[T] = js.native
    /* protected */ def preprocessData(data: js.Array[T]): js.Array[T] = js.native
    
    /**
      * Create the content row by row below the header
      *
      * @param data Array of JSON objects to be converted to CSV
      * @returns CSV string (body)
      */
    /* protected */ def processData(data: js.Array[T]): String = js.native
  }
}
