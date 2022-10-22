package typingsJapgolly.xrm.Xrm

import typingsJapgolly.xrm.xrmStrings.entitylist
import typingsJapgolly.xrm.xrmStrings.savedquery
import typingsJapgolly.xrm.xrmStrings.userquery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for value returned from Xrm.Utility.getPageContext()
  * @see {@link https://docs.microsoft.com/powerapps/developer/model-driven-apps/clientapi/reference/xrm-utility/getpagecontext#entity-list External Link: getPageContext (Client API reference)}
  */
trait EntityListPageContext extends StObject {
  
  /**
    * Logical name of the entity currently displayed.
    */
  var entityName: String
  
  /**
    * The current page type.
    */
  var pageType: entitylist
  
  /**
    * ID of the view currently displayed.
    */
  var viewId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the view currently displayed.
    */
  var viewType: js.UndefOr[savedquery | userquery] = js.undefined
}
object EntityListPageContext {
  
  inline def apply(entityName: String): EntityListPageContext = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = "entitylist")
    __obj.asInstanceOf[EntityListPageContext]
  }
  
  extension [Self <: EntityListPageContext](x: Self) {
    
    inline def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setPageType(value: entitylist): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
    
    inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
    
    inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
    
    inline def setViewType(value: savedquery | userquery): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
    
    inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
  }
}
