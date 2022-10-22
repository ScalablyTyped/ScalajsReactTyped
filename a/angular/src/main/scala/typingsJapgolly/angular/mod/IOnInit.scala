package typingsJapgolly.angular.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the $onInit lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
trait IOnInit extends StObject {
  
  /**
    * Called on each controller after all the controllers on an element have been constructed and had their bindings
    * initialized (and before the pre & post linking functions for the directives on this element). This is a good
    * place to put initialization code for your controller.
    */
  @JSName("$onInit")
  def $onInit(): Unit
}
object IOnInit {
  
  inline def apply($onInit: Callback): IOnInit = {
    val __obj = js.Dynamic.literal($onInit = $onInit.toJsFn)
    __obj.asInstanceOf[IOnInit]
  }
  
  extension [Self <: IOnInit](x: Self) {
    
    inline def set$onInit(value: Callback): Self = StObject.set(x, "$onInit", value.toJsFn)
  }
}
