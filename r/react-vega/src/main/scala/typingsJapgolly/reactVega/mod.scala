package typingsJapgolly.reactVega

import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactVega.anon.Data
import typingsJapgolly.reactVega.anon.Mode
import typingsJapgolly.reactVega.libCreateClassFromSpecMod.Constructor
import typingsJapgolly.reactVega.libCreateClassFromSpecMod.FixedVegaChartProps
import typingsJapgolly.reactVega.libVegaLiteMod.VegaLiteProps
import typingsJapgolly.reactVega.libVegaMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-vega", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-vega", "Vega")
  @js.native
  open class Vega () extends default
  /* static members */
  object Vega {
    
    @JSImport("react-vega", "Vega")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-vega", "Vega.defaultProps")
    @js.native
    def defaultProps: Data = js.native
    inline def defaultProps_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def VegaLite(props: VegaLiteProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("VegaLite")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createClassFromSpec(hasModeSpec: Mode): Constructor[PureComponent[FixedVegaChartProps, js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClassFromSpec")(hasModeSpec.asInstanceOf[js.Any]).asInstanceOf[Constructor[PureComponent[FixedVegaChartProps, js.Object, Any]]]
}
