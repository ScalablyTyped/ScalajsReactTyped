package typingsJapgolly.ionicStorage

import typingsJapgolly.angularCore.mod.InjectionToken
import typingsJapgolly.angularCore.mod.ModuleWithProviders
import typingsJapgolly.ionicStorage.storageMod.StorageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/storage", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class IonicStorageModule () extends js.Object
  
  @js.native
  class Storage protected ()
    extends typingsJapgolly.ionicStorage.storageMod.Storage {
    /**
      * Create a new Storage instance using the order of drivers and any additional config
      * options to pass to LocalForage.
      *
      * Possible driver options are: ['sqlite', 'indexeddb', 'websql', 'localstorage'] and the
      * default is that exact ordering.
      */
    def this(config: StorageConfig) = this()
  }
  
  val StorageConfigToken: InjectionToken[js.Any] = js.native
  def ɵa(storageConfig: StorageConfig): typingsJapgolly.ionicStorage.storageMod.Storage = js.native
  /* static members */
  @js.native
  object IonicStorageModule extends js.Object {
    def forRoot(): ModuleWithProviders[_] = js.native
    def forRoot(storageConfig: StorageConfig): ModuleWithProviders[_] = js.native
  }
  
}

