package typingsJapgolly.officeUiFabricReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[ReactInstance] {
  
  var navigatedMonth: HTMLElement
}
object Dictkey {
  
  inline def apply(navigatedMonth: HTMLElement): Dictkey = {
    val __obj = js.Dynamic.literal(navigatedMonth = navigatedMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setNavigatedMonth(value: HTMLElement): Self = StObject.set(x, "navigatedMonth", value.asInstanceOf[js.Any])
  }
}
