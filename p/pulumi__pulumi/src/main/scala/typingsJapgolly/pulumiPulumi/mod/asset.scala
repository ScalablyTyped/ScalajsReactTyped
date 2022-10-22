package typingsJapgolly.pulumiPulumi.mod

import typingsJapgolly.pulumiPulumi.assetArchiveMod.AssetMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asset {
  
  /* note: abstract class */ @JSImport("@pulumi/pulumi", "asset.Archive")
  @js.native
  open class Archive ()
    extends typingsJapgolly.pulumiPulumi.assetMod.Archive
  /* static members */
  object Archive {
    
    @JSImport("@pulumi/pulumi", "asset.Archive")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of an Archive.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/asset/archive.Archive */ Boolean]
  }
  
  /* note: abstract class */ @JSImport("@pulumi/pulumi", "asset.Asset")
  @js.native
  open class Asset ()
    extends typingsJapgolly.pulumiPulumi.assetMod.Asset
  /* static members */
  object Asset {
    
    @JSImport("@pulumi/pulumi", "asset.Asset")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of an Asset.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean]
  }
  
  @JSImport("@pulumi/pulumi", "asset.AssetArchive")
  @js.native
  open class AssetArchive protected ()
    extends typingsJapgolly.pulumiPulumi.assetMod.AssetArchive {
    def this(assets: js.Promise[AssetMap]) = this()
    def this(assets: AssetMap) = this()
  }
  
  @JSImport("@pulumi/pulumi", "asset.FileArchive")
  @js.native
  open class FileArchive protected ()
    extends typingsJapgolly.pulumiPulumi.assetMod.FileArchive {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
  }
  
  @JSImport("@pulumi/pulumi", "asset.FileAsset")
  @js.native
  open class FileAsset protected ()
    extends typingsJapgolly.pulumiPulumi.assetMod.FileAsset {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
  }
  
  @JSImport("@pulumi/pulumi", "asset.RemoteArchive")
  @js.native
  open class RemoteArchive protected ()
    extends typingsJapgolly.pulumiPulumi.assetMod.RemoteArchive {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
  }
  
  @JSImport("@pulumi/pulumi", "asset.RemoteAsset")
  @js.native
  open class RemoteAsset protected ()
    extends typingsJapgolly.pulumiPulumi.assetMod.RemoteAsset {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
  }
  
  @JSImport("@pulumi/pulumi", "asset.StringAsset")
  @js.native
  open class StringAsset protected ()
    extends typingsJapgolly.pulumiPulumi.assetMod.StringAsset {
    def this(text: String) = this()
    def this(text: js.Promise[String]) = this()
  }
}
