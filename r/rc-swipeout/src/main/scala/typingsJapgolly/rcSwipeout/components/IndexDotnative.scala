package typingsJapgolly.rcSwipeout.components

import typingsJapgolly.rcSwipeout.libIndexDotnativeMod.default
import typingsJapgolly.rcSwipeout.libPropTypesMod.IPropTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndexDotnative {
  
  @JSImport("rc-swipeout/lib/index.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: IndexDotnative.type): SharedBuilder_IPropTypes_1705893743[default] = new SharedBuilder_IPropTypes_1705893743[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPropTypes): SharedBuilder_IPropTypes_1705893743[default] = new SharedBuilder_IPropTypes_1705893743[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
