package typingsJapgolly.firebaseFirestore.distLitePrivateMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2017 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * Simple wrapper around a nullable UID. Mostly exists to make code more
  * readable.
  */
trait User extends StObject {
  
  def isAuthenticated(): Boolean
  
  def isEqual(otherUser: User): Boolean
  
  /**
    * Returns a key representing this user, suitable for inclusion in a
    * dictionary.
    */
  def toKey(): String
  
  val uid: String | Null
}
object User {
  
  inline def apply(isAuthenticated: CallbackTo[Boolean], isEqual: User => Boolean, toKey: CallbackTo[String]): User = {
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.toJsFn, isEqual = js.Any.fromFunction1(isEqual), toKey = toKey.toJsFn, uid = null)
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setIsAuthenticated(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAuthenticated", value.toJsFn)
    
    inline def setIsEqual(value: User => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setToKey(value: CallbackTo[String]): Self = StObject.set(x, "toKey", value.toJsFn)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
  }
}
