package typingsJapgolly.atom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.anon.Reloaded
import typingsJapgolly.atom.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHistoryManagerMod {
  
  trait HistoryManager extends StObject {
    
    /**
      *  Clear all projects from the history.
      *  Note: This is not a privacy function - other traces will still exist, e.g.
      *  window state.
      */
    def clearProjects(): Unit
    
    /** Obtain a list of previously opened projects. */
    def getProjects(): js.Array[ProjectHistory]
    
    /** Invoke the given callback when the list of projects changes. */
    def onDidChangeProjects(callback: js.Function1[/* args */ Reloaded, Unit]): Disposable
  }
  object HistoryManager {
    
    inline def apply(
      clearProjects: Callback,
      getProjects: CallbackTo[js.Array[ProjectHistory]],
      onDidChangeProjects: js.Function1[/* args */ Reloaded, Unit] => Disposable
    ): HistoryManager = {
      val __obj = js.Dynamic.literal(clearProjects = clearProjects.toJsFn, getProjects = getProjects.toJsFn, onDidChangeProjects = js.Any.fromFunction1(onDidChangeProjects))
      __obj.asInstanceOf[HistoryManager]
    }
    
    extension [Self <: HistoryManager](x: Self) {
      
      inline def setClearProjects(value: Callback): Self = StObject.set(x, "clearProjects", value.toJsFn)
      
      inline def setGetProjects(value: CallbackTo[js.Array[ProjectHistory]]): Self = StObject.set(x, "getProjects", value.toJsFn)
      
      inline def setOnDidChangeProjects(value: js.Function1[/* args */ Reloaded, Unit] => Disposable): Self = StObject.set(x, "onDidChangeProjects", js.Any.fromFunction1(value))
    }
  }
  
  trait ProjectHistory extends StObject {
    
    var lastOpened: js.Date
    
    var paths: js.Array[String]
  }
  object ProjectHistory {
    
    inline def apply(lastOpened: js.Date, paths: js.Array[String]): ProjectHistory = {
      val __obj = js.Dynamic.literal(lastOpened = lastOpened.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectHistory]
    }
    
    extension [Self <: ProjectHistory](x: Self) {
      
      inline def setLastOpened(value: js.Date): Self = StObject.set(x, "lastOpened", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
}
