package typingsJapgolly.umbraco.umbraco.services

import typingsJapgolly.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Show dialog args
  */
trait IShowDialogArgs extends StObject {
  
  var action: IShowDialogAction
  
  var scope: IScope
}
object IShowDialogArgs {
  
  inline def apply(action: IShowDialogAction, scope: IScope): IShowDialogArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShowDialogArgs]
  }
  
  extension [Self <: IShowDialogArgs](x: Self) {
    
    inline def setAction(value: IShowDialogAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
