package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeMaterialUi.anon.AccountContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerHeaderAccountProps extends StObject {
  
  var accounts: js.UndefOr[js.Array[typingsJapgolly.reactNativeMaterialUi.anon.Avatar]] = js.undefined
  
  var avatar: js.UndefOr[Element] = js.undefined
  
  var footer: js.UndefOr[js.Object] = js.undefined
  
  var style: js.UndefOr[AccountContainer] = js.undefined
}
object DrawerHeaderAccountProps {
  
  inline def apply(): DrawerHeaderAccountProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerHeaderAccountProps]
  }
  
  extension [Self <: DrawerHeaderAccountProps](x: Self) {
    
    inline def setAccounts(value: js.Array[typingsJapgolly.reactNativeMaterialUi.anon.Avatar]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: typingsJapgolly.reactNativeMaterialUi.anon.Avatar*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setAvatar(value: VdomElement): Self = StObject.set(x, "avatar", value.rawElement.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setFooter(value: js.Object): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setStyle(value: AccountContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
