package typingsJapgolly.json2csv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2csv/JSON2CSVParser", JSImport.Namespace)
@js.native
object json2csvparserMod extends js.Object {
  @js.native
  trait JSON2CSVParser[T]
    extends typingsJapgolly.json2csv.json2csvbaseMod.default[T] {
    /**
      * Main function that converts json to csv.
      *
      * @param {object|object[]} data Array of JSON objects to be converted to CSV
      * @returns {string} The CSV formated data as a string
      */
    def parse(data: T): String = js.native
    def parse(data: js.Array[T]): String = js.native
    /**
      * Preprocess the data according to the give opts (unwind, flatten, etc.)
      and calculate the fields and field names if they are not provided.
      *
      * @param {object|object[]} data Array or object to be converted to CSV
      * @returns {object[]} Preprocessed data ready to be processed
      */
    /* protected */ def preprocessData(data: T): js.Array[T] = js.native
    /* protected */ def preprocessData(data: js.Array[T]): js.Array[T] = js.native
    /**
      * Create the content row by row below the header
      *
      * @param {object[]} data Array of JSON objects to be converted to CSV
      * @returns {string} CSV string (body)
      */
    /* protected */ def processData(data: js.Array[T]): String = js.native
  }
  
  @js.native
  class default[T] () extends JSON2CSVParser[T]
  
}

