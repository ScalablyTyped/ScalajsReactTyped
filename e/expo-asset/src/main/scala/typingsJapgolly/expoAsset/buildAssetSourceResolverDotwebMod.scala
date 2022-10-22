package typingsJapgolly.expoAsset

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAssetSourceResolverDotwebMod {
  
  @JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AssetSourceResolver {
    def this(serverUrl: String, jsbundleUrl: String, asset: PackagerAsset) = this()
    def this(serverUrl: String, jsbundleUrl: Null, asset: PackagerAsset) = this()
    def this(serverUrl: String, jsbundleUrl: Unit, asset: PackagerAsset) = this()
    def this(serverUrl: Null, jsbundleUrl: String, asset: PackagerAsset) = this()
    def this(serverUrl: Null, jsbundleUrl: Null, asset: PackagerAsset) = this()
    def this(serverUrl: Null, jsbundleUrl: Unit, asset: PackagerAsset) = this()
    def this(serverUrl: Unit, jsbundleUrl: String, asset: PackagerAsset) = this()
    def this(serverUrl: Unit, jsbundleUrl: Null, asset: PackagerAsset) = this()
    def this(serverUrl: Unit, jsbundleUrl: Unit, asset: PackagerAsset) = this()
    
    /* CompleteClass */
    var asset: PackagerAsset = js.native
    
    /* CompleteClass */
    override def assetServerURL(): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def defaultAsset(): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def drawableFolderInBundle(): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def fromSource(source: String): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def isLoadedFromFileSystem(): Boolean = js.native
    
    /* CompleteClass */
    override def isLoadedFromServer(): Boolean = js.native
    
    /* CompleteClass */
    override def resourceIdentifierWithoutScale(): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def scaledAssetPath(): ResolvedAssetSource = js.native
    
    /* CompleteClass */
    override def scaledAssetURLNearBundle(): ResolvedAssetSource = js.native
  }
  /* static members */
  object default {
    
    @JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def pickScale(scales: js.Array[Double], deviceScale: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pickScale")(scales.asInstanceOf[js.Any], deviceScale.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  trait AssetSourceResolver extends StObject {
    
    var asset: PackagerAsset
    
    def assetServerURL(): ResolvedAssetSource
    
    def defaultAsset(): ResolvedAssetSource
    
    def drawableFolderInBundle(): ResolvedAssetSource
    
    def fromSource(source: String): ResolvedAssetSource
    
    def isLoadedFromFileSystem(): Boolean
    
    def isLoadedFromServer(): Boolean
    
    var jsbundleUrl: js.UndefOr[String | Null] = js.undefined
    
    def resourceIdentifierWithoutScale(): ResolvedAssetSource
    
    def scaledAssetPath(): ResolvedAssetSource
    
    def scaledAssetURLNearBundle(): ResolvedAssetSource
    
    var serverUrl: js.UndefOr[String | Null] = js.undefined
  }
  object AssetSourceResolver {
    
    inline def apply(
      asset: PackagerAsset,
      assetServerURL: CallbackTo[ResolvedAssetSource],
      defaultAsset: CallbackTo[ResolvedAssetSource],
      drawableFolderInBundle: CallbackTo[ResolvedAssetSource],
      fromSource: String => ResolvedAssetSource,
      isLoadedFromFileSystem: CallbackTo[Boolean],
      isLoadedFromServer: CallbackTo[Boolean],
      resourceIdentifierWithoutScale: CallbackTo[ResolvedAssetSource],
      scaledAssetPath: CallbackTo[ResolvedAssetSource],
      scaledAssetURLNearBundle: CallbackTo[ResolvedAssetSource]
    ): AssetSourceResolver = {
      val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], assetServerURL = assetServerURL.toJsFn, defaultAsset = defaultAsset.toJsFn, drawableFolderInBundle = drawableFolderInBundle.toJsFn, fromSource = js.Any.fromFunction1(fromSource), isLoadedFromFileSystem = isLoadedFromFileSystem.toJsFn, isLoadedFromServer = isLoadedFromServer.toJsFn, resourceIdentifierWithoutScale = resourceIdentifierWithoutScale.toJsFn, scaledAssetPath = scaledAssetPath.toJsFn, scaledAssetURLNearBundle = scaledAssetURLNearBundle.toJsFn)
      __obj.asInstanceOf[AssetSourceResolver]
    }
    
    extension [Self <: AssetSourceResolver](x: Self) {
      
      inline def setAsset(value: PackagerAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
      
      inline def setAssetServerURL(value: CallbackTo[ResolvedAssetSource]): Self = StObject.set(x, "assetServerURL", value.toJsFn)
      
      inline def setDefaultAsset(value: CallbackTo[ResolvedAssetSource]): Self = StObject.set(x, "defaultAsset", value.toJsFn)
      
      inline def setDrawableFolderInBundle(value: CallbackTo[ResolvedAssetSource]): Self = StObject.set(x, "drawableFolderInBundle", value.toJsFn)
      
      inline def setFromSource(value: String => ResolvedAssetSource): Self = StObject.set(x, "fromSource", js.Any.fromFunction1(value))
      
      inline def setIsLoadedFromFileSystem(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoadedFromFileSystem", value.toJsFn)
      
      inline def setIsLoadedFromServer(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoadedFromServer", value.toJsFn)
      
      inline def setJsbundleUrl(value: String): Self = StObject.set(x, "jsbundleUrl", value.asInstanceOf[js.Any])
      
      inline def setJsbundleUrlNull: Self = StObject.set(x, "jsbundleUrl", null)
      
      inline def setJsbundleUrlUndefined: Self = StObject.set(x, "jsbundleUrl", js.undefined)
      
      inline def setResourceIdentifierWithoutScale(value: CallbackTo[ResolvedAssetSource]): Self = StObject.set(x, "resourceIdentifierWithoutScale", value.toJsFn)
      
      inline def setScaledAssetPath(value: CallbackTo[ResolvedAssetSource]): Self = StObject.set(x, "scaledAssetPath", value.toJsFn)
      
      inline def setScaledAssetURLNearBundle(value: CallbackTo[ResolvedAssetSource]): Self = StObject.set(x, "scaledAssetURLNearBundle", value.toJsFn)
      
      inline def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
      
      inline def setServerUrlNull: Self = StObject.set(x, "serverUrl", null)
      
      inline def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
    }
  }
  
  trait PackagerAsset extends StObject {
    
    var __packager_asset: Boolean
    
    var fileSystemLocation: String
    
    var hash: String
    
    var height: js.UndefOr[Double] = js.undefined
    
    var httpServerLocation: String
    
    var name: String
    
    var scales: js.Array[Double]
    
    var `type`: String
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PackagerAsset {
    
    inline def apply(
      __packager_asset: Boolean,
      fileSystemLocation: String,
      hash: String,
      httpServerLocation: String,
      name: String,
      scales: js.Array[Double],
      `type`: String
    ): PackagerAsset = {
      val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], fileSystemLocation = fileSystemLocation.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], httpServerLocation = httpServerLocation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackagerAsset]
    }
    
    extension [Self <: PackagerAsset](x: Self) {
      
      inline def setFileSystemLocation(value: String): Self = StObject.set(x, "fileSystemLocation", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHttpServerLocation(value: String): Self = StObject.set(x, "httpServerLocation", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScales(value: js.Array[Double]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesVarargs(value: Double*): Self = StObject.set(x, "scales", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def set__packager_asset(value: Boolean): Self = StObject.set(x, "__packager_asset", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolvedAssetSource extends StObject {
    
    var __packager_asset: Boolean
    
    var height: js.UndefOr[Double] = js.undefined
    
    var scale: Double
    
    var uri: String
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ResolvedAssetSource {
    
    inline def apply(__packager_asset: Boolean, scale: Double, uri: String): ResolvedAssetSource = {
      val __obj = js.Dynamic.literal(__packager_asset = __packager_asset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedAssetSource]
    }
    
    extension [Self <: ResolvedAssetSource](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def set__packager_asset(value: Boolean): Self = StObject.set(x, "__packager_asset", value.asInstanceOf[js.Any])
    }
  }
}
