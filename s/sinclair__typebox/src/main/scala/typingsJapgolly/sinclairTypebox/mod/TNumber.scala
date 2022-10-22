package typingsJapgolly.sinclairTypebox.mod

import typingsJapgolly.sinclairTypebox.sinclairTypeboxStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StObject because Already inherited
- org.scalablytyped.runtime.StringDictionary because Already inherited
- typingsJapgolly.sinclairTypebox.mod.SchemaOptions because Already inherited
- typingsJapgolly.sinclairTypebox.mod._TAnySchema because Already inherited
- typingsJapgolly.sinclairTypebox.mod.NumericOptions because var conflicts: $id, $schema, default, description, examples, title. Inlined exclusiveMaximum, exclusiveMinimum, maximum, minimum, multipleOf */ @js.native
trait TNumber
  extends StObject
     with TSchema
     with TNumeric {
  
  var exclusiveMaximum: js.UndefOr[Double] = js.native
  
  var exclusiveMinimum: js.UndefOr[Double] = js.native
  
  var maximum: js.UndefOr[Double] = js.native
  
  var minimum: js.UndefOr[Double] = js.native
  
  var multipleOf: js.UndefOr[Double] = js.native
  
  @JSName("static")
  var static_TNumber: Double = js.native
  
  var `type`: number = js.native
}
