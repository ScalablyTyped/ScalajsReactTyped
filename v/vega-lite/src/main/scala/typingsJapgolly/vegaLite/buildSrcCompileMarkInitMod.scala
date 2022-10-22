package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.Graticule
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcEncodingMod.Encoding
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcMarkMod.Mark
import typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef
import typingsJapgolly.vegaLite.vegaLiteStrings.arc
import typingsJapgolly.vegaLite.vegaLiteStrings.area
import typingsJapgolly.vegaLite.vegaLiteStrings.bar
import typingsJapgolly.vegaLite.vegaLiteStrings.circle
import typingsJapgolly.vegaLite.vegaLiteStrings.geoshape
import typingsJapgolly.vegaLite.vegaLiteStrings.image
import typingsJapgolly.vegaLite.vegaLiteStrings.line
import typingsJapgolly.vegaLite.vegaLiteStrings.point
import typingsJapgolly.vegaLite.vegaLiteStrings.rect
import typingsJapgolly.vegaLite.vegaLiteStrings.rule
import typingsJapgolly.vegaLite.vegaLiteStrings.square
import typingsJapgolly.vegaLite.vegaLiteStrings.text
import typingsJapgolly.vegaLite.vegaLiteStrings.tick
import typingsJapgolly.vegaLite.vegaLiteStrings.trail
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkInitMod {
  
  @JSImport("vega-lite/build/src/compile/mark/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultFilled(markDef: MarkDef[Mark, ExprRef | SignalRef], config: Config[SignalRef], hasGraticule: Graticule): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFilled")(markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasGraticule.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def initMarkdef(
    originalMarkDef: MarkDef[Mark, ExprRef | SignalRef],
    encoding: Encoding[String],
    config: Config[SignalRef]
  ): MarkDef[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick, 
    SignalRef
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("initMarkdef")(originalMarkDef.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MarkDef[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick, 
    SignalRef
  ]]
}
