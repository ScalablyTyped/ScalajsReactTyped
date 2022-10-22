package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.libCardCardMod.CardProps
import typingsJapgolly.antd.libCardGridMod.CardGridProps
import typingsJapgolly.antd.libCardMetaMod.CardMetaProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCardMod extends Shortcut {
  
  @JSImport("antd/lib/card", JSImport.Default)
  @js.native
  val default: CardInterface = js.native
  
  @js.native
  trait CardInterface
    extends StObject
       with ForwardRefExoticComponent[CardProps & RefAttributes[HTMLDivElement]] {
    
    var Grid: FC[CardGridProps] = js.native
    
    var Meta: FC[CardMetaProps] = js.native
  }
  
  type InternalCardType = ForwardRefExoticComponent[CardProps & RefAttributes[HTMLDivElement]]
  
  type _To = CardInterface
  
  /* This means you don't have to write `default`, but can instead just say `libCardMod.foo` */
  override def _to: CardInterface = default
}
