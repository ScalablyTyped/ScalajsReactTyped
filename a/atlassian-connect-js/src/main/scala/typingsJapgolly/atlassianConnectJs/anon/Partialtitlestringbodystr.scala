package typingsJapgolly.atlassianConnectJs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.auto
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.error
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.info
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.manual
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.success
import typingsJapgolly.atlassianConnectJs.atlassianConnectJsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  title :string,   body :string,   type :'info' | 'success' | 'warning' | 'error',   close :'manual' | 'auto',   actions :{[key: string] : string}}> */
trait Partialtitlestringbodystr extends StObject {
  
  var actions: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  var close: js.UndefOr[manual | auto] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[info | success | warning | error] = js.undefined
}
object Partialtitlestringbodystr {
  
  inline def apply(): Partialtitlestringbodystr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialtitlestringbodystr]
  }
  
  extension [Self <: Partialtitlestringbodystr](x: Self) {
    
    inline def setActions(value: StringDictionary[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setClose(value: manual | auto): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: info | success | warning | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
