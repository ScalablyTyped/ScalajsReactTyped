package typingsJapgolly.webgme

import typingsJapgolly.webgme.Blobs.ObjectBlob
import typingsJapgolly.webgme.GmeCommon.Dictionary
import typingsJapgolly.webgme.GmeConfig.ClientOptions
import typingsJapgolly.webgme.GmeConfig.PluginConfig
import typingsJapgolly.webgme.anon.AllowBrowserExecution
import typingsJapgolly.webgme.anon.AllowDuplication
import typingsJapgolly.webgme.anon.AllowGuests
import typingsJapgolly.webgme.anon.AutoMerge
import typingsJapgolly.webgme.anon.BasePaths
import typingsJapgolly.webgme.anon.BehindSecureProxy
import typingsJapgolly.webgme.anon.ClearOldDataAtStartUp
import typingsJapgolly.webgme.anon.Components
import typingsJapgolly.webgme.anon.DecoratorPaths
import typingsJapgolly.webgme.anon.EnableCustomConstraints
import typingsJapgolly.webgme.anon.Log
import typingsJapgolly.webgme.anon.Manager
import typingsJapgolly.webgme.anon.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginPluginConfigMod {
  
  @JSImport("plugin/PluginConfig", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PluginConfig {
    
    /**  Add-on related settings. */
    /* CompleteClass */
    var addOns: BasePaths = js.native
    
    /**  Authentication related settings. */
    /* CompleteClass */
    var authentication: AllowGuests = js.native
    
    /** Bin script related settings. */
    /* CompleteClass */
    var bin: Log = js.native
    
    /** Blob related settings. */
    /* CompleteClass */
    var blob: ObjectBlob = js.native
    
    /** Client related settings. */
    /* CompleteClass */
    var client: ClientOptions = js.native
    
    /** Client related settings. */
    /* CompleteClass */
    var core: EnableCustomConstraints = js.native
    
    /**
      * If true will add extra debug messages and also 
      * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
      */
    /* CompleteClass */
    var debug: Boolean = js.native
    
    /** Executor related settings. */
    /* CompleteClass */
    var executor: ClearOldDataAtStartUp = js.native
    
    /** Mongo database related settings. */
    /* CompleteClass */
    var mongo: Uri = js.native
    
    /** Plugin related settings. */
    /* CompleteClass */
    var plugin: AllowBrowserExecution = js.native
    
    /** Additional paths to for requirejs. 
      * Custom paths that will be added to the 
      * paths of requirejs configuration. 
      * Paths added here will also be served under the given key, 
      * i.e. {myPath: './aPath/aSubPath/'} 
      * will expose files via <host>/myPath/someFile.js.
      */
    /* CompleteClass */
    var requirejsPaths: Dictionary[String] = js.native
    
    /** REST related settings. */
    /* CompleteClass */
    var rest: Components = js.native
    
    /** Seed related settings. */
    /* CompleteClass */
    var seedProjects: AllowDuplication = js.native
    
    /**
      *  Serialize the configuration.
      * @returns {*} 
      * @memberOf GmeConfig
      */
    /* CompleteClass */
    override def serialize(): Any = js.native
    
    /** Server related settings. */
    /* CompleteClass */
    var server: BehindSecureProxy = js.native
    
    /** Socket IO related settings. */
    /* CompleteClass */
    var socketIO: typingsJapgolly.webgme.anon.ClientOptions = js.native
    
    /** Storage related settings. */
    /* CompleteClass */
    var storage: AutoMerge = js.native
    
    /** Visualization related settings. */
    /* CompleteClass */
    var visualization: DecoratorPaths = js.native
    
    /* CompleteClass */
    var webhooks: Manager = js.native
  }
}
