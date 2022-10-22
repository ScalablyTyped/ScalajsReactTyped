package typingsJapgolly.winrt.global.Windows.ApplicationModel

import typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import typingsJapgolly.winrt.anon.First
import typingsJapgolly.winrt.anon.Items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Resources {
  
  object Core {
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.NamedResource")
    @js.native
    open class NamedResource ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidate")
    @js.native
    open class ResourceCandidate ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate {
      
      /* CompleteClass */
      override def getQualifierValue(qualifierName: String): String = js.native
      
      /* CompleteClass */
      override def getValueAsFileAsync(): IAsyncOperation[StorageFile] = js.native
      
      /* CompleteClass */
      var isDefault: Boolean = js.native
      
      /* CompleteClass */
      var isMatch: Boolean = js.native
      
      /* CompleteClass */
      var isMatchAsDefault: Boolean = js.native
      
      /* CompleteClass */
      var qualifiers: IVectorView[typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier] = js.native
      
      /* CompleteClass */
      var valueAsString: String = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView")
    @js.native
    open class ResourceCandidateVectorView ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidateVectorView {
      
      /* CompleteClass */
      override def first(): IIterator[typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceCandidate] = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
    @js.native
    open class ResourceContext ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext
    /* static members */
    object ResourceContext {
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContext")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createMatchingContext(result: IIterable[typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier]): typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createMatchingContext")(result.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext]
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView")
    @js.native
    open class ResourceContextLanguagesVectorView ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceContextLanguagesVectorView {
      
      /* CompleteClass */
      override def first(): IIterator[String] = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
    @js.native
    open class ResourceManager ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager {
      
      /* CompleteClass */
      var allResourceMaps: IMapView[String, typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
      
      /* CompleteClass */
      var defaultContext: typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceContext = js.native
      
      /* CompleteClass */
      override def loadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
      
      /* CompleteClass */
      var mainResourceMap: typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap = js.native
      
      /* CompleteClass */
      override def unloadPriFiles(files: IIterable[IStorageFile]): Unit = js.native
    }
    /* static members */
    object ResourceManager {
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceManager.current")
      @js.native
      def current: typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager = js.native
      inline def current_=(x: typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
      
      inline def isResourceReference(resourceReference: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResourceReference")(resourceReference.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMap")
    @js.native
    open class ResourceMap ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap {
      
      /* CompleteClass */
      override def first(): IIterator[
            IKeyValuePair[
              String, 
              typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
            ]
          ] = js.native
      
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /* CompleteClass */
      override def lookup(key: String): typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.NamedResource = js.native
      
      /* CompleteClass */
      var size: Double = js.native
      
      /* CompleteClass */
      override def split(): First[
            String, 
            typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
          ] = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapIterator")
    @js.native
    open class ResourceMapIterator ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapIterator {
      
      /* CompleteClass */
      var current: IKeyValuePair[
            String, 
            typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
          ] = js.native
      
      /* CompleteClass */
      override def getMany(): Items[
            IKeyValuePair[
              String, 
              typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.NamedResource
            ]
          ] = js.native
      
      /* CompleteClass */
      var hasCurrent: Boolean = js.native
      
      /* CompleteClass */
      override def moveNext(): Boolean = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapView")
    @js.native
    open class ResourceMapMapView ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapMapView {
      
      /* CompleteClass */
      override def first(): IIterator[
            IKeyValuePair[String, typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap]
          ] = js.native
      
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /* CompleteClass */
      override def lookup(key: String): typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap = js.native
      
      /* CompleteClass */
      var size: Double = js.native
      
      /* CompleteClass */
      override def split(): First[String, typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator")
    @js.native
    open class ResourceMapMapViewIterator ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator {
      
      /* CompleteClass */
      var current: IKeyValuePair[String, typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap] = js.native
      
      /* CompleteClass */
      override def getMany(): Items[
            IKeyValuePair[String, typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap]
          ] = js.native
      
      /* CompleteClass */
      var hasCurrent: Boolean = js.native
      
      /* CompleteClass */
      override def moveNext(): Boolean = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifier")
    @js.native
    open class ResourceQualifier ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier {
      
      /* CompleteClass */
      var isDefault: Boolean = js.native
      
      /* CompleteClass */
      var isMatch: Boolean = js.native
      
      /* CompleteClass */
      var qualifierName: String = js.native
      
      /* CompleteClass */
      var qualifierValue: String = js.native
      
      /* CompleteClass */
      var score: Double = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView")
    @js.native
    open class ResourceQualifierMapView ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierMapView {
      
      /* CompleteClass */
      override def first(): IIterator[IKeyValuePair[String, String]] = js.native
      
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /* CompleteClass */
      override def lookup(key: String): String = js.native
      
      /* CompleteClass */
      var size: Double = js.native
      
      /* CompleteClass */
      override def split(): First[String, String] = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap")
    @js.native
    open class ResourceQualifierObservableMap ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap {
      
      /* CompleteClass */
      override def clear(): Unit = js.native
      
      /* CompleteClass */
      override def first(): IIterator[IKeyValuePair[String, String]] = js.native
      
      /* CompleteClass */
      override def getView(): IMapView[String, String] = js.native
      
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /* CompleteClass */
      override def insert(key: String, value: String): Boolean = js.native
      
      /* CompleteClass */
      override def lookup(key: String): String = js.native
      
      /* CompleteClass */
      var onmapchanged: Any = js.native
      
      /* CompleteClass */
      override def remove(key: String): Unit = js.native
      
      /* CompleteClass */
      var size: Double = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView")
    @js.native
    open class ResourceQualifierVectorView ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView {
      
      /* CompleteClass */
      override def first(): IIterator[typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier] = js.native
    }
  }
  
  object Management {
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate")
    @js.native
    open class IndexedResourceCandidate ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate {
      
      /* CompleteClass */
      override def getQualifierValue(qualifierName: String): String = js.native
      
      /* CompleteClass */
      var metadata: IMapView[String, String] = js.native
      
      /* CompleteClass */
      var qualifiers: IVectorView[
            typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier
          ] = js.native
      
      /* CompleteClass */
      var `type`: IndexedResourceType = js.native
      
      /* CompleteClass */
      var uri: Uri = js.native
      
      /* CompleteClass */
      var valueAsString: String = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier")
    @js.native
    open class IndexedResourceQualifier ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier {
      
      /* CompleteClass */
      var qualifierName: String = js.native
      
      /* CompleteClass */
      var qualifierValue: String = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
    @js.native
    object IndexedResourceType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType & Double
          ] = js.native
      
      /* 1 */ val path: typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.path & Double = js.native
      
      /* 0 */ val string: typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.string & Double = js.native
    }
    
    @JSGlobal("Windows.ApplicationModel.Resources.Management.ResourceIndexer")
    @js.native
    open class ResourceIndexer protected ()
      extends StObject
         with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management.ResourceIndexer {
      def this(projectRoot: Uri) = this()
      
      /* CompleteClass */
      override def indexFileContentsAsync(file: Uri): IAsyncOperation[
            IVectorView[
              typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate
            ]
          ] = js.native
      
      /* CompleteClass */
      override def indexFilePath(filePath: Uri): typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceCandidate = js.native
    }
  }
  
  @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
  @js.native
  open class ResourceLoader ()
    extends StObject
       with typingsJapgolly.winrt.Windows.ApplicationModel.Resources.ResourceLoader {
    def this(name: String) = this()
    
    /* CompleteClass */
    override def getString(resource: String): String = js.native
  }
  /* static members */
  object ResourceLoader {
    
    @JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStringForReference(uri: Uri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringForReference")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
