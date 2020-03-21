package typingsJapgolly.espruino

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Creates a Task Object</p>
* 
* @url http://www.espruino.com/Reference#l_Task_Task
*/
@js.native
trait Task
  extends /**
  * 
  * @param taskName 
  * @return  
  */
Instantiable1[/* taskName */ js.Any, js.Any] {
  /**
    * <p>returns name of actual task</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Task_getCurrent
    */
  def getCurrent(): js.Any = js.native
  /**
    * <p>logs list of tasks</p>
    * 
    * @url http://www.espruino.com/Reference#l_Task_log
    */
  def log(): Unit = js.native
  /**
    * <p>Resumes a suspended task</p>
    * 
    * @url http://www.espruino.com/Reference#l_Task_resume
    */
  def resume(): Unit = js.native
  /**
    * <p>Suspend task, be careful not to suspend Espruino task itself</p>
    * 
    * @url http://www.espruino.com/Reference#l_Task_suspend
    */
  def suspend(): Unit = js.native
}

