package typingsJapgolly.pulumiPulumi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetAssetMod {
  
  /* note: abstract class */ @JSImport("@pulumi/pulumi/asset/asset", "Asset")
  @js.native
  open class Asset () extends StObject
  /* static members */
  object Asset {
    
    @JSImport("@pulumi/pulumi/asset/asset", "Asset")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of an Asset.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/asset/asset.Asset */ Boolean]
  }
  
  @JSImport("@pulumi/pulumi/asset/asset", "FileAsset")
  @js.native
  open class FileAsset protected () extends Asset {
    def this(path: String) = this()
    def this(path: js.Promise[String]) = this()
    
    /**
      * The path to the asset file.
      */
    val path: js.Promise[String] = js.native
  }
  
  @JSImport("@pulumi/pulumi/asset/asset", "RemoteAsset")
  @js.native
  open class RemoteAsset protected () extends Asset {
    def this(uri: String) = this()
    def this(uri: js.Promise[String]) = this()
    
    /**
      * The URI where the asset lives.
      */
    val uri: js.Promise[String] = js.native
  }
  
  @JSImport("@pulumi/pulumi/asset/asset", "StringAsset")
  @js.native
  open class StringAsset protected () extends Asset {
    def this(text: String) = this()
    def this(text: js.Promise[String]) = this()
    
    /**
      * The string contents.
      */
    val text: js.Promise[String] = js.native
  }
}
