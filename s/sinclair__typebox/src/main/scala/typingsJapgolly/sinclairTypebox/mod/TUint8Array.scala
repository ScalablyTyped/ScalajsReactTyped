package typingsJapgolly.sinclairTypebox.mod

import typingsJapgolly.sinclairTypebox.sinclairTypeboxStrings.Uint8Array
import typingsJapgolly.sinclairTypebox.sinclairTypeboxStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited
- typingsJapgolly.sinclairTypebox.mod.SchemaOptions because Already inherited
- typingsJapgolly.sinclairTypebox.mod._TAnySchema because Already inherited
- typingsJapgolly.sinclairTypebox.mod.Uint8ArrayOptions because var conflicts: $id, $schema, default, description, examples, title. Inlined maxByteLength, minByteLength */ @js.native
trait TUint8Array
  extends StObject
     with TSchema {
  
  var maxByteLength: js.UndefOr[Double] = js.native
  
  var minByteLength: js.UndefOr[Double] = js.native
  
  var specialized: Uint8Array = js.native
  
  @JSName("static")
  var static_TUint8Array: js.typedarray.Uint8Array = js.native
  
  var `type`: `object` = js.native
}
