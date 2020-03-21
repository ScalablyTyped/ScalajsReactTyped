package typingsJapgolly.breeze.breeze

import typingsJapgolly.breeze.AnonName
import typingsJapgolly.breeze.breeze.core.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.MetadataStore")
@js.native
class MetadataStore () extends js.Object {
  def this(config: MetadataStoreOptions) = this()
  var namingConvention: NamingConvention = js.native
  def addDataService(dataService: DataService): Unit = js.native
  def addDataService(dataService: DataService, shouldOverwrite: Boolean): Unit = js.native
  def addEntityType(structuralType: IStructuralType): Unit = js.native
  def exportMetadata(): String = js.native
  def fetchMetadata(dataService: String): js.Promise[_] = js.native
  def fetchMetadata(dataService: String, callback: js.Function1[/* data */ js.Any, Unit]): js.Promise[_] = js.native
  def fetchMetadata(dataService: String, callback: js.Function1[/* data */ js.Any, Unit], errorCallback: ErrorCallback): js.Promise[_] = js.native
  def fetchMetadata(dataService: DataService): js.Promise[_] = js.native
  def fetchMetadata(dataService: DataService, callback: js.Function1[/* data */ js.Any, Unit]): js.Promise[_] = js.native
  def fetchMetadata(
    dataService: DataService,
    callback: js.Function1[/* data */ js.Any, Unit],
    errorCallback: ErrorCallback
  ): js.Promise[_] = js.native
  def getDataService(serviceName: String): DataService = js.native
  def getEntityType(entityTypeName: String): IStructuralType = js.native
  def getEntityType(entityTypeName: String, okIfNotFound: Boolean): IStructuralType = js.native
  def getEntityTypeNameForResourceName(resourceName: String): String = js.native
  def getEntityTypes(): js.Array[IStructuralType] = js.native
  def hasMetadataFor(serviceName: String): Boolean = js.native
  def importMetadata(exportedString: String): MetadataStore = js.native
  def importMetadata(exportedString: String, allowMerge: Boolean): MetadataStore = js.native
  def isEmpty(): Boolean = js.native
  def registerEntityTypeCtor(entityTypeName: String, entityCtor: js.Function): Unit = js.native
  def registerEntityTypeCtor(
    entityTypeName: String,
    entityCtor: js.Function,
    initializationFn: js.Function1[/* entity */ Entity, Unit]
  ): Unit = js.native
  def registerEntityTypeCtor(
    entityTypeName: String,
    entityCtor: js.Function,
    initializationFn: js.Function1[/* entity */ Entity, Unit],
    noTrackingFn: js.Function2[/* node */ js.Object, /* entityType */ EntityType, js.Object]
  ): Unit = js.native
  def setEntityTypeForResourceName(resourceName: String, entityTypeName: String): Unit = js.native
  def setEntityTypeForResourceName(resourceName: String, entityType: EntityType): Unit = js.native
  def setProperties(config: AnonName): Unit = js.native
  def trackUnmappedType(entityCtor: js.Function): Unit = js.native
  def trackUnmappedType(entityCtor: js.Function, interceptor: js.Function): Unit = js.native
}

/* static members */
@JSGlobal("breeze.MetadataStore")
@js.native
object MetadataStore extends js.Object {
  def importMetadata(exportedString: String): MetadataStore = js.native
  def normalizeTypeName(typeName: String): String = js.native
}

