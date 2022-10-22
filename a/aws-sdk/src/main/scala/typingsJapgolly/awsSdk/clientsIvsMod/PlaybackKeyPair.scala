package typingsJapgolly.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackKeyPair extends StObject {
  
  /**
    * Key-pair ARN.
    */
  var arn: js.UndefOr[PlaybackKeyPairArn] = js.undefined
  
  /**
    * Key-pair identifier.
    */
  var fingerprint: js.UndefOr[PlaybackKeyPairFingerprint] = js.undefined
  
  /**
    * Playback-key-pair name. The value does not need to be unique.
    */
  var name: js.UndefOr[PlaybackKeyPairName] = js.undefined
  
  /**
    * Array of 1-50 maps, each of the form string:string (key:value). See Tagging Amazon Web Services Resources for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is documented there.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object PlaybackKeyPair {
  
  inline def apply(): PlaybackKeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaybackKeyPair]
  }
  
  extension [Self <: PlaybackKeyPair](x: Self) {
    
    inline def setArn(value: PlaybackKeyPairArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setFingerprint(value: PlaybackKeyPairFingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setName(value: PlaybackKeyPairName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
