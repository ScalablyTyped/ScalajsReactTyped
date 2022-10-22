package typingsJapgolly.rcMotion

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcMotion.anon.CSSMotionPropsrefRefanyun
import typingsJapgolly.rcMotion.esCssmotionlistMod.CSSMotionListProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-motion", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-motion", "CSSMotionList")
  @js.native
  open class CSSMotionList protected () extends Component[CSSMotionListProps, Any, Any] {
    def this(props: CSSMotionListProps) = this()
    def this(props: CSSMotionListProps, context: Any) = this()
  }
  @JSImport("rc-motion", "CSSMotionList")
  @js.native
  val CSSMotionList: ComponentClassP[CSSMotionListProps & js.Object] = js.native
  
  type _To = ForwardRefExoticComponent[CSSMotionPropsrefRefanyun]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[CSSMotionPropsrefRefanyun] = default
}
