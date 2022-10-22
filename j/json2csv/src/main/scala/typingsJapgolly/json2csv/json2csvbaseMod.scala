package typingsJapgolly.json2csv

import typingsJapgolly.json2csv.mod.FieldInfo
import typingsJapgolly.json2csv.mod.NormalizedFieldInfo
import typingsJapgolly.json2csv.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object json2csvbaseMod {
  
  /* note: abstract class */ @JSImport("json2csv/JSON2CSVBase", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with JSON2CSVBase[T] {
    def this(opts: Options[T]) = this()
  }
  
  @js.native
  trait JSON2CSVBase[T] extends StObject {
    
    /**
      * Create the title row with all the provided fields as column headings
      *
      * @returns titles as a string
      */
    /* protected */ def getHeader(): String = js.native
    
    /**
      * Check and normalize the fields configuration.
      *
      * @param fields Fields configuration provided by the user
      * or inferred from the data
      * @returns preprocessed FieldsInfo array
      */
    def preprocessFieldsInfo[T](fields: js.Array[String | FieldInfo[T]]): js.Array[NormalizedFieldInfo[T]] = js.native
    
    /**
      * Check passing opts and set defaults.
      *
      * @param opts Options object containing fields,
      * delimiter, default value, quote mark, header, etc.
      * @returns preprocessed Options object
      */
    /* protected */ def preprocessOpts(): Options[T] = js.native
    /* protected */ def preprocessOpts(opts: Options[T]): Options[T] = js.native
    
    /**
      * Preprocess each object according to the give opts (unwind, flatten, etc.).
      *
      * @param row JSON object to be converted in a CSV row
      */
    /* protected */ def preprocessRow(row: T): js.Object = js.native
    
    /**
      * Create the content of a specfic CSV row cell
      *
      * @param row JSON object representing the CSV row that the cell belongs to
      * @param fieldInfo Details of the field to process to be a CSV cell
      * @returns CSV string (cell)
      */
    /* protected */ def processCell(row: T, fieldInfo: NormalizedFieldInfo[T]): String = js.native
    
    /**
      * Create the content of a specific CSV row
      *
      * @param row JSON object to be converted in a CSV row
      * @returns CSV string (row)
      */
    /* protected */ def processRow(row: T): String = js.native
    
    /**
      * Create the content of a specfic CSV row cell
      *
      * @param  value Value to be included in a CSV cell
      * @returns Value stringified and processed
      */
    /* protected */ def processValue(value: Any): String = js.native
  }
}
