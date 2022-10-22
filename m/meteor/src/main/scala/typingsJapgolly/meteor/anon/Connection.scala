package typingsJapgolly.meteor.anon

import typingsJapgolly.meteor.Meteor.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  var connection: typingsJapgolly.meteor.Meteor.Connection
  
  var user: User
}
object Connection {
  
  inline def apply(connection: typingsJapgolly.meteor.Meteor.Connection, user: User): Connection = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setConnection(value: typingsJapgolly.meteor.Meteor.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
