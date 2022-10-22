package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.AriaAriaRoleDescription
import typingsJapgolly.vegaLite.anon.AriaRoleDescription
import typingsJapgolly.vegaLite.anon.Clip
import typingsJapgolly.vegaLite.anon.Description
import typingsJapgolly.vegaLite.anon.PartialRecordVgEncodeChan
import typingsJapgolly.vegaLite.anon.`4`
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodeAriaMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/aria", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aria(model: UnitModel): AriaRoleDescription | Description | Clip | AriaAriaRoleDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("aria")(model.asInstanceOf[js.Any]).asInstanceOf[AriaRoleDescription | Description | Clip | AriaAriaRoleDescription]
  
  inline def description(model: UnitModel): PartialRecordVgEncodeChan | `4` = ^.asInstanceOf[js.Dynamic].applyDynamic("description")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan | `4`]
}
