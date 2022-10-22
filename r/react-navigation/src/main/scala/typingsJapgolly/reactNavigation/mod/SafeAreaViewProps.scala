package typingsJapgolly.reactNavigation.mod

import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNavigation.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeAreaViewProps
  extends StObject
     with ViewProps {
  
  var forceInset: js.UndefOr[Bottom] = js.undefined
}
object SafeAreaViewProps {
  
  inline def apply(): SafeAreaViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAreaViewProps]
  }
  
  extension [Self <: SafeAreaViewProps](x: Self) {
    
    inline def setForceInset(value: Bottom): Self = StObject.set(x, "forceInset", value.asInstanceOf[js.Any])
    
    inline def setForceInsetUndefined: Self = StObject.set(x, "forceInset", js.undefined)
  }
}
