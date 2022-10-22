package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trie extends StObject {
  
  def addString(text: String): Boolean
  
  def addStrings(strings: js.Array[String]): Unit
  
  def contains(token: String): Boolean
  
  def findMatchesOnPath(text: String): js.Array[String]
  
  def findPrefix(text: String): js.Array[String]
  
  def keysWithPrefix(text: String): js.Array[String]
}
object Trie {
  
  inline def apply(
    addString: String => Boolean,
    addStrings: js.Array[String] => Callback,
    contains: String => Boolean,
    findMatchesOnPath: String => js.Array[String],
    findPrefix: String => js.Array[String],
    keysWithPrefix: String => js.Array[String]
  ): Trie = {
    val __obj = js.Dynamic.literal(addString = js.Any.fromFunction1(addString), addStrings = js.Any.fromFunction1((t0: js.Array[String]) => addStrings(t0).runNow()), contains = js.Any.fromFunction1(contains), findMatchesOnPath = js.Any.fromFunction1(findMatchesOnPath), findPrefix = js.Any.fromFunction1(findPrefix), keysWithPrefix = js.Any.fromFunction1(keysWithPrefix))
    __obj.asInstanceOf[Trie]
  }
  
  extension [Self <: Trie](x: Self) {
    
    inline def setAddString(value: String => Boolean): Self = StObject.set(x, "addString", js.Any.fromFunction1(value))
    
    inline def setAddStrings(value: js.Array[String] => Callback): Self = StObject.set(x, "addStrings", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setContains(value: String => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setFindMatchesOnPath(value: String => js.Array[String]): Self = StObject.set(x, "findMatchesOnPath", js.Any.fromFunction1(value))
    
    inline def setFindPrefix(value: String => js.Array[String]): Self = StObject.set(x, "findPrefix", js.Any.fromFunction1(value))
    
    inline def setKeysWithPrefix(value: String => js.Array[String]): Self = StObject.set(x, "keysWithPrefix", js.Any.fromFunction1(value))
  }
}
