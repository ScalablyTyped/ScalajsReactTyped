package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.anon.Config
import typingsJapgolly.antd.libModalConfirmMod.ModalStaticFunctions
import typingsJapgolly.antd.libModalModalMod.ModalProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalMod extends Shortcut {
  
  @JSImport("antd/lib/modal", JSImport.Default)
  @js.native
  val default: ModalType = js.native
  
  type ModalType = FC[ModalProps] & ModalStaticFunctions & Config
  
  type _To = ModalType
  
  /* This means you don't have to write `default`, but can instead just say `libModalMod.foo` */
  override def _to: ModalType = default
}
