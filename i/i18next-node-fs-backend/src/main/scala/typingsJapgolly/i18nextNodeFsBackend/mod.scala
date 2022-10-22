package typingsJapgolly.i18nextNodeFsBackend

import typingsJapgolly.i18next.i18nextStrings.backend
import typingsJapgolly.i18next.mod.BackendModule
import typingsJapgolly.i18next.mod.InitOptions
import typingsJapgolly.i18next.mod.ModuleType
import typingsJapgolly.i18next.mod.ReadCallback
import typingsJapgolly.i18next.mod.Services
import typingsJapgolly.i18nextNodeFsBackend.i18nextNodeFsBackEnd.i18nextNodeFsBackEndOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof Backend` */
  @JSImport("i18next-node-fs-backend", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Backend {
    def this(services: Any) = this()
    def this(services: Any, options: i18nextNodeFsBackEndOptions) = this()
    def this(services: Unit, options: i18nextNodeFsBackEndOptions) = this()
    
    /* CompleteClass */
    override def init(services: Services, backendOptions: i18nextNodeFsBackEndOptions, i18nextOptions: InitOptions): Unit = js.native
    
    /* CompleteClass */
    override def read(language: String, namespace: String, callback: ReadCallback): Unit = js.native
    
    /* CompleteClass */
    var `type`: ModuleType = js.native
    /* CompleteClass */
    @JSName("type")
    var type_BackendModule: backend = js.native
  }
  
  @js.native
  trait Backend
    extends StObject
       with BackendModule[i18nextNodeFsBackEndOptions] {
    
    @JSName("create")
    def create_MBackend(languages: js.Array[String], namespace: String, key: String, fallbackValue: String): Unit = js.native
    
    def init(services: Services): Unit = js.native
    def init(services: Services, backendOptions: Unit, i18nextOptions: InitOptions): Unit = js.native
    def init(services: Services, backendOptions: i18nextNodeFsBackEndOptions): Unit = js.native
    
    @JSName("type")
    var type_Backend: typingsJapgolly.i18nextNodeFsBackend.i18nextNodeFsBackendStrings.backend = js.native
  }
  
  /* was `typeof Backend` */
  type module = Backend
}
