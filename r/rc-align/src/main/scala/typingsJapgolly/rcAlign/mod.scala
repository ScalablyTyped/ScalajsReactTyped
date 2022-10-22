package typingsJapgolly.rcAlign

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcAlign.esAlignMod.AlignProps
import typingsJapgolly.rcAlign.esAlignMod.RefAlign
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-align", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]] = js.native
  
  type _To = ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]] = default
}
