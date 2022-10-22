package typingsJapgolly.blockingProxy

import typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.HttpMethod
import typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.paramKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockingProxyStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HttpMethod
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethod
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait elementId
    extends StObject
       with paramKey
  inline def elementId: elementId = "elementId".asInstanceOf[elementId]
  
  @js.native
  sealed trait name
    extends StObject
       with paramKey
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait propertyName
    extends StObject
       with paramKey
  inline def propertyName: propertyName = "propertyName".asInstanceOf[propertyName]
  
  @js.native
  sealed trait sessionId
    extends StObject
       with paramKey
  inline def sessionId: sessionId = "sessionId".asInstanceOf[sessionId]
}
