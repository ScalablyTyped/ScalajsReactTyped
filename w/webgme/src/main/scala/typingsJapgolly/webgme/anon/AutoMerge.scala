package typingsJapgolly.webgme.anon

import typingsJapgolly.webgme.webgmeStrings.ZSSHA
import typingsJapgolly.webgme.webgmeStrings.plainSHA1
import typingsJapgolly.webgme.webgmeStrings.rand160Bits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMerge extends StObject {
  
  /**
    * (N.B. Experimental feature) 
    * If enable, incoming commits to branches that initially 
    * were FORKED will be attempted to be merged with the head of the branch. 
    * Use with caution as larger (+100k nodes) projects can slow down the commit rate.
    *   config.storage.autoMerge.enable = false;
    */
  var autoMerge: Enable
  
  /**
    * If true, events regarding project/branch creation/deletion 
    * are only broadcasted and not emitted back to the socket who made the change. 
    * Only modify this if you are writing a custom GUI.
    *  config.storage.broadcastProjectEvents = false;
    */
  var broadcastProjectEvents: Boolean
  
  /**
    * Number of core-objects stored before emptying cache (server side).
    *  config.storage.cache = 2000;
    */
  var cache: Double
  
  /**
    * Number of core-objects stored before emptying cache (client side).
    *   config.storage.clientCache = 2000;
    */
  var clientCache: Double
  
  var database: Type
  
  /**
    * Since v2.6.2 patched objects on the server are being 
    * checked for consistency w.r.t. the provided hash 
    * before insertion into database. 
    * If true, no checking at all will take place.
    *   config.storage.disableHashChecks = false;
    */
  var disableHashChecks: Boolean
  
  /**
    * Algorithm used when hashing the objects in the database, 
    * can be 'plainSHA1', 'rand160Bits' or 'ZSSHA'.
    *   config.storage.keyType = 'plainSha';
    */
  var keyType: plainSHA1 | rand160Bits | ZSSHA
  
  /**
    * Size of bucket before triggering a load of objects from the server.
    *   config.storage.loadBucketSize = 100;
    */
  var loadBucketSize: Double
  
  /**
    * Time in milliseconds (after a new bucket has been created) 
    * before triggering a load of objects from the server.
    *   config.storage.loadBucketTimer = 10;
    */
  var loadBucketTimer: Double
  
  /**
    * If greater than -1, the maximum number of core objects 
    * that will be emitted to other clients. 
    * N.B. this only applies to newly created nodes, 
    * any modified data will always be sent as patches.
    *   config.storage.maxEmittedCoreObjects = -1;
    */
  var maxEmittedCoreObjects: Double
  
  /**
    * Options passed to database client 
    * (unless mongo is specified, in that case config.mongo.options are used).
    *   config.storage.database.options = '{}';
    */
  var options: String
  
  /**
    * If config.storage.disableHashChecks is set to 
    * false and this option is set to true, 
    * will not insert objects if the hashes do not match. 
    * Set this to false to only log the errors.
    *   config.storage.requireHashesToMatch = true;
    */
  var requireHashesToMatch: Boolean
}
object AutoMerge {
  
  inline def apply(
    autoMerge: Enable,
    broadcastProjectEvents: Boolean,
    cache: Double,
    clientCache: Double,
    database: Type,
    disableHashChecks: Boolean,
    keyType: plainSHA1 | rand160Bits | ZSSHA,
    loadBucketSize: Double,
    loadBucketTimer: Double,
    maxEmittedCoreObjects: Double,
    options: String,
    requireHashesToMatch: Boolean
  ): AutoMerge = {
    val __obj = js.Dynamic.literal(autoMerge = autoMerge.asInstanceOf[js.Any], broadcastProjectEvents = broadcastProjectEvents.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], clientCache = clientCache.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], disableHashChecks = disableHashChecks.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any], loadBucketSize = loadBucketSize.asInstanceOf[js.Any], loadBucketTimer = loadBucketTimer.asInstanceOf[js.Any], maxEmittedCoreObjects = maxEmittedCoreObjects.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], requireHashesToMatch = requireHashesToMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMerge]
  }
  
  extension [Self <: AutoMerge](x: Self) {
    
    inline def setAutoMerge(value: Enable): Self = StObject.set(x, "autoMerge", value.asInstanceOf[js.Any])
    
    inline def setBroadcastProjectEvents(value: Boolean): Self = StObject.set(x, "broadcastProjectEvents", value.asInstanceOf[js.Any])
    
    inline def setCache(value: Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setClientCache(value: Double): Self = StObject.set(x, "clientCache", value.asInstanceOf[js.Any])
    
    inline def setDatabase(value: Type): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDisableHashChecks(value: Boolean): Self = StObject.set(x, "disableHashChecks", value.asInstanceOf[js.Any])
    
    inline def setKeyType(value: plainSHA1 | rand160Bits | ZSSHA): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setLoadBucketSize(value: Double): Self = StObject.set(x, "loadBucketSize", value.asInstanceOf[js.Any])
    
    inline def setLoadBucketTimer(value: Double): Self = StObject.set(x, "loadBucketTimer", value.asInstanceOf[js.Any])
    
    inline def setMaxEmittedCoreObjects(value: Double): Self = StObject.set(x, "maxEmittedCoreObjects", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRequireHashesToMatch(value: Boolean): Self = StObject.set(x, "requireHashesToMatch", value.asInstanceOf[js.Any])
  }
}
