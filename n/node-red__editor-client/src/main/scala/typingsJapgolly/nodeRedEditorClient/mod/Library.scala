package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodeRedEditorClient.anon.Container
import typingsJapgolly.nodeRedEditorClient.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Library extends StObject {
  
  def create(options: typingsJapgolly.nodeRedEditorClient.anon.Editor): Unit
  
  def createBrowser(options: Container): Data
  
  def init(): Unit
  
  def loadLibraryFolder(
    library: String,
    `type`: String,
    root: String,
    done: js.Function1[/* items */ js.Array[js.Object], Unit]
  ): Unit
}
object Library {
  
  inline def apply(
    create: typingsJapgolly.nodeRedEditorClient.anon.Editor => Callback,
    createBrowser: Container => Data,
    init: Callback,
    loadLibraryFolder: (String, String, String, js.Function1[/* items */ js.Array[js.Object], Unit]) => Callback
  ): Library = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1((t0: typingsJapgolly.nodeRedEditorClient.anon.Editor) => create(t0).runNow()), createBrowser = js.Any.fromFunction1(createBrowser), init = init.toJsFn, loadLibraryFolder = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: js.Function1[/* items */ js.Array[js.Object], Unit]) => (loadLibraryFolder(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[Library]
  }
  
  extension [Self <: Library](x: Self) {
    
    inline def setCreate(value: typingsJapgolly.nodeRedEditorClient.anon.Editor => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: typingsJapgolly.nodeRedEditorClient.anon.Editor) => value(t0).runNow()))
    
    inline def setCreateBrowser(value: Container => Data): Self = StObject.set(x, "createBrowser", js.Any.fromFunction1(value))
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setLoadLibraryFolder(value: (String, String, String, js.Function1[/* items */ js.Array[js.Object], Unit]) => Callback): Self = StObject.set(x, "loadLibraryFolder", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: js.Function1[/* items */ js.Array[js.Object], Unit]) => (value(t0, t1, t2, t3)).runNow()))
  }
}
