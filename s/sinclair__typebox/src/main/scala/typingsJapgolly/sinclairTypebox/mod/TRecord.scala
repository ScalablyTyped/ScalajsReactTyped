package typingsJapgolly.sinclairTypebox.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sinclairTypebox.sinclairTypeboxBooleans.`false`
import typingsJapgolly.sinclairTypebox.sinclairTypeboxStrings.`object`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TRecord[K /* <: TRecordKey */, T /* <: TSchema */]
  extends StObject
     with TSchema {
  
  var additionalProperties: `false` = js.native
  
  var patternProperties: StringDictionary[T] = js.native
  
  @JSName("static")
  var static_TRecord: Record[
    Static[K, js.Array[Any]], 
    Static[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: this['params'] */ js.Any
    ]
  ] = js.native
  
  var `type`: `object` = js.native
}
