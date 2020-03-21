package typingsJapgolly.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Built-in class that caches the modules used by the <code>require</code> command</p>
* 
* @url http://www.espruino.com/Reference#Modules
*/
@js.native
trait Modules extends /**
  * 
  * @return  
  */
Instantiable0[Modules]

/**
* 
*/
@JSGlobal("Modules")
@js.native
object Modules extends js.Object {
  /**
    * <p>Add the given module to the cache</p>
    * 
    * @param id 
    * @param sourcecode 
    * @url http://www.espruino.com/Reference#l_Modules_addCached
    */
  def addCached(id: js.Any, sourcecode: js.Any): Unit = js.native
  /**
    * <p>Return an array of module names that have been cached</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Modules_getCached
    */
  def getCached(): js.Any = js.native
  /**
    * <p>Remove all cached modules</p>
    * 
    * @url http://www.espruino.com/Reference#l_Modules_removeAllCached
    */
  def removeAllCached(): Unit = js.native
  /**
    * <p>Remove the given module from the list of cached modules</p>
    * 
    * @param id 
    * @url http://www.espruino.com/Reference#l_Modules_removeCached
    */
  def removeCached(id: js.Any): Unit = js.native
}

