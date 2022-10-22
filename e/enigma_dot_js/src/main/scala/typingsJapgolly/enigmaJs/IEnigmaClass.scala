package typingsJapgolly.enigmaJs

import typingsJapgolly.enigmaJs.enigmaJS.IConfig
import typingsJapgolly.enigmaJs.enigmaJS.ISession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// declare const enigmaJS: IEnigmaClass;
// export = enigmaJS;
// export as namespace enigmaJS;
trait IEnigmaClass extends StObject {
  
  /**
    * Create a session object.
    * @returns - Returns a session.
    * Note: See Configuration for the configuration options.
    */
  def create(config: IConfig): ISession
}
object IEnigmaClass {
  
  inline def apply(create: IConfig => ISession): IEnigmaClass = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[IEnigmaClass]
  }
  
  extension [Self <: IEnigmaClass](x: Self) {
    
    inline def setCreate(value: IConfig => ISession): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
