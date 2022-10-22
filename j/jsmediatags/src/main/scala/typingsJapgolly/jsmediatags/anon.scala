package typingsJapgolly.jsmediatags

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.jsmediatags.build2MediaFileReaderMod.default
import typingsJapgolly.jsmediatags.typesMod.ByteRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AvoidHeadRequests extends StObject {
    
    var avoidHeadRequests: Boolean
    
    var disallowedXhrHeaders: js.Array[String]
    
    var timeoutInSec: Double
  }
  object AvoidHeadRequests {
    
    inline def apply(avoidHeadRequests: Boolean, disallowedXhrHeaders: js.Array[String], timeoutInSec: Double): AvoidHeadRequests = {
      val __obj = js.Dynamic.literal(avoidHeadRequests = avoidHeadRequests.asInstanceOf[js.Any], disallowedXhrHeaders = disallowedXhrHeaders.asInstanceOf[js.Any], timeoutInSec = timeoutInSec.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvoidHeadRequests]
    }
    
    extension [Self <: AvoidHeadRequests](x: Self) {
      
      inline def setAvoidHeadRequests(value: Boolean): Self = StObject.set(x, "avoidHeadRequests", value.asInstanceOf[js.Any])
      
      inline def setDisallowedXhrHeaders(value: js.Array[String]): Self = StObject.set(x, "disallowedXhrHeaders", value.asInstanceOf[js.Any])
      
      inline def setDisallowedXhrHeadersVarargs(value: String*): Self = StObject.set(x, "disallowedXhrHeaders", js.Array(value*))
      
      inline def setTimeoutInSec(value: Double): Self = StObject.set(x, "timeoutInSec", value.asInstanceOf[js.Any])
    }
  }
  
  trait CRC extends StObject {
    
    var CRC: Double
    
    var RESTRICTIONS: Double
    
    var UPDATE: Double
  }
  object CRC {
    
    inline def apply(CRC: Double, RESTRICTIONS: Double, UPDATE: Double): CRC = {
      val __obj = js.Dynamic.literal(CRC = CRC.asInstanceOf[js.Any], RESTRICTIONS = RESTRICTIONS.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
      __obj.asInstanceOf[CRC]
    }
    
    extension [Self <: CRC](x: Self) {
      
      inline def setCRC(value: Double): Self = StObject.set(x, "CRC", value.asInstanceOf[js.Any])
      
      inline def setRESTRICTIONS(value: Double): Self = StObject.set(x, "RESTRICTIONS", value.asInstanceOf[js.Any])
      
      inline def setUPDATE(value: Double): Self = StObject.set(x, "UPDATE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Compression extends StObject {
    
    var compression: Boolean
    
    var data_length_indicator: Boolean
    
    var encryption: Boolean
    
    var grouping_identity: Boolean
    
    var unsynchronisation: Boolean
  }
  object Compression {
    
    inline def apply(
      compression: Boolean,
      data_length_indicator: Boolean,
      encryption: Boolean,
      grouping_identity: Boolean,
      unsynchronisation: Boolean
    ): Compression = {
      val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], data_length_indicator = data_length_indicator.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], grouping_identity = grouping_identity.asInstanceOf[js.Any], unsynchronisation = unsynchronisation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compression]
    }
    
    extension [Self <: Compression](x: Self) {
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setData_length_indicator(value: Boolean): Self = StObject.set(x, "data_length_indicator", value.asInstanceOf[js.Any])
      
      inline def setEncryption(value: Boolean): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setGrouping_identity(value: Boolean): Self = StObject.set(x, "grouping_identity", value.asInstanceOf[js.Any])
      
      inline def setUnsynchronisation(value: Boolean): Self = StObject.set(x, "unsynchronisation", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndIx extends StObject {
    
    var endIx: Double
    
    var insertIx: js.UndefOr[Double] = js.undefined
    
    var startIx: Double
  }
  object EndIx {
    
    inline def apply(endIx: Double, startIx: Double): EndIx = {
      val __obj = js.Dynamic.literal(endIx = endIx.asInstanceOf[js.Any], startIx = startIx.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndIx]
    }
    
    extension [Self <: EndIx](x: Self) {
      
      inline def setEndIx(value: Double): Self = StObject.set(x, "endIx", value.asInstanceOf[js.Any])
      
      inline def setInsertIx(value: Double): Self = StObject.set(x, "insertIx", value.asInstanceOf[js.Any])
      
      inline def setInsertIxUndefined: Self = StObject.set(x, "insertIx", js.undefined)
      
      inline def setStartIx(value: Double): Self = StObject.set(x, "startIx", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filealterpreservation extends StObject {
    
    var file_alter_preservation: Boolean
    
    var read_only: Boolean
    
    var tag_alter_preservation: Boolean
  }
  object Filealterpreservation {
    
    inline def apply(file_alter_preservation: Boolean, read_only: Boolean, tag_alter_preservation: Boolean): Filealterpreservation = {
      val __obj = js.Dynamic.literal(file_alter_preservation = file_alter_preservation.asInstanceOf[js.Any], read_only = read_only.asInstanceOf[js.Any], tag_alter_preservation = tag_alter_preservation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filealterpreservation]
    }
    
    extension [Self <: Filealterpreservation](x: Self) {
      
      inline def setFile_alter_preservation(value: Boolean): Self = StObject.set(x, "file_alter_preservation", value.asInstanceOf[js.Any])
      
      inline def setRead_only(value: Boolean): Self = StObject.set(x, "read_only", value.asInstanceOf[js.Any])
      
      inline def setTag_alter_preservation(value: Boolean): Self = StObject.set(x, "tag_alter_preservation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofMediaFileReader
    extends StObject
       with Instantiable0[default]
       with Instantiable1[/* path */ Any, default] {
    
    def canReadFile(file: Any): Boolean = js.native
  }
  
  @js.native
  trait TypeofMediaTagReader
    extends StObject
       with Instantiable1[
          /* mediaFileReader */ default, 
          typingsJapgolly.jsmediatags.build2MediaTagReaderMod.default
        ] {
    
    def canReadTagFormat(tagIdentifier: js.Array[Double]): Boolean = js.native
    
    def getTagIdentifierByteRange(): ByteRange = js.native
  }
}
