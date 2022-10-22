package typingsJapgolly.reactCircularProgressbar

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactCircularProgressbar.anon.BackgroundColor
import typingsJapgolly.reactCircularProgressbar.distCircularProgressbarMod.default
import typingsJapgolly.reactCircularProgressbar.distCircularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typingsJapgolly.reactCircularProgressbar.distTypesMod.CircularProgressbarDefaultProps
import typingsJapgolly.reactCircularProgressbar.distTypesMod.CircularProgressbarStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-circular-progressbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-circular-progressbar", "CircularProgressbar")
  @js.native
  open class CircularProgressbar () extends default
  object CircularProgressbar {
    
    @JSImport("react-circular-progressbar", "CircularProgressbar")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-circular-progressbar", "CircularProgressbar.defaultProps")
    @js.native
    def defaultProps: CircularProgressbarDefaultProps = js.native
    inline def defaultProps_=(x: CircularProgressbarDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def CircularProgressbarWithChildren(props: CircularProgressbarWithChildrenProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CircularProgressbarWithChildren")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def buildStyles(
    hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor: BackgroundColor
  ): CircularProgressbarStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("buildStyles")(hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor.asInstanceOf[js.Any]).asInstanceOf[CircularProgressbarStyles]
}
