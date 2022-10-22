package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link XFramesSupplier} instead of that
  * @deprecated Deprecated
  */
trait XTasksSupplier
  extends StObject
     with XInterface {
  
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  val ActiveTask: XTask
  
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  val Tasks: XEnumerationAccess
  
  /**
    * use {@link XFramesSupplier.getActiveFrame()} instead of this one
    * @deprecated Deprecated
    */
  def getActiveTask(): XTask
  
  /**
    * use {@link XFramesSupplier.getFrames()} instead of this one
    * @deprecated Deprecated
    */
  def getTasks(): XEnumerationAccess
}
object XTasksSupplier {
  
  inline def apply(
    ActiveTask: XTask,
    Tasks: XEnumerationAccess,
    acquire: Callback,
    getActiveTask: CallbackTo[XTask],
    getTasks: CallbackTo[XEnumerationAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XTasksSupplier = {
    val __obj = js.Dynamic.literal(ActiveTask = ActiveTask.asInstanceOf[js.Any], Tasks = Tasks.asInstanceOf[js.Any], acquire = acquire.toJsFn, getActiveTask = getActiveTask.toJsFn, getTasks = getTasks.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTasksSupplier]
  }
  
  extension [Self <: XTasksSupplier](x: Self) {
    
    inline def setActiveTask(value: XTask): Self = StObject.set(x, "ActiveTask", value.asInstanceOf[js.Any])
    
    inline def setGetActiveTask(value: CallbackTo[XTask]): Self = StObject.set(x, "getActiveTask", value.toJsFn)
    
    inline def setGetTasks(value: CallbackTo[XEnumerationAccess]): Self = StObject.set(x, "getTasks", value.toJsFn)
    
    inline def setTasks(value: XEnumerationAccess): Self = StObject.set(x, "Tasks", value.asInstanceOf[js.Any])
  }
}
