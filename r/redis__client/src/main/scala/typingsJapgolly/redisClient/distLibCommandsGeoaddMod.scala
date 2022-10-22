package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoCoordinates
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArgument
import typingsJapgolly.redisClient.distLibCommandsMod.RedisCommandArguments
import typingsJapgolly.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsGeoaddMod {
  
  @JSImport("@redis/client/dist/lib/commands/GEOADD", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client/dist/lib/commands/GEOADD", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: RedisCommandArgument, toAdd: js.Array[GeoMember]): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], toAdd.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, toAdd: js.Array[GeoMember], options: GeoAddOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], toAdd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, toAdd: GeoMember): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], toAdd.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  inline def transformArguments(key: RedisCommandArgument, toAdd: GeoMember, options: GeoAddOptions): RedisCommandArguments = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], toAdd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RedisCommandArguments]
  
  inline def transformReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[Double]
  
  trait GeoAddCommonOptions extends StObject {
    
    var CH: js.UndefOr[`true`] = js.undefined
  }
  object GeoAddCommonOptions {
    
    inline def apply(): GeoAddCommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoAddCommonOptions]
    }
    
    extension [Self <: GeoAddCommonOptions](x: Self) {
      
      inline def setCH(value: `true`): Self = StObject.set(x, "CH", value.asInstanceOf[js.Any])
      
      inline def setCHUndefined: Self = StObject.set(x, "CH", js.undefined)
    }
  }
  
  type GeoAddOptions = SetGuards & GeoAddCommonOptions
  
  trait GeoMember
    extends StObject
       with GeoCoordinates {
    
    var member: RedisCommandArgument
  }
  object GeoMember {
    
    inline def apply(latitude: String | Double, longitude: String | Double, member: RedisCommandArgument): GeoMember = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], member = member.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoMember]
    }
    
    extension [Self <: GeoMember](x: Self) {
      
      inline def setMember(value: RedisCommandArgument): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    }
  }
  
  trait NX
    extends StObject
       with SetGuards {
    
    var NX: js.UndefOr[`true`] = js.undefined
  }
  object NX {
    
    inline def apply(): NX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NX]
    }
    
    extension [Self <: NX](x: Self) {
      
      inline def setNX(value: `true`): Self = StObject.set(x, "NX", value.asInstanceOf[js.Any])
      
      inline def setNXUndefined: Self = StObject.set(x, "NX", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.redisClient.distLibCommandsGeoaddMod.NX
    - typingsJapgolly.redisClient.distLibCommandsGeoaddMod.XX
  */
  trait SetGuards extends StObject
  object SetGuards {
    
    inline def NX(): typingsJapgolly.redisClient.distLibCommandsGeoaddMod.NX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.redisClient.distLibCommandsGeoaddMod.NX]
    }
    
    inline def XX(): typingsJapgolly.redisClient.distLibCommandsGeoaddMod.XX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.redisClient.distLibCommandsGeoaddMod.XX]
    }
  }
  
  trait XX
    extends StObject
       with SetGuards {
    
    var XX: js.UndefOr[`true`] = js.undefined
  }
  object XX {
    
    inline def apply(): XX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XX]
    }
    
    extension [Self <: XX](x: Self) {
      
      inline def setXX(value: `true`): Self = StObject.set(x, "XX", value.asInstanceOf[js.Any])
      
      inline def setXXUndefined: Self = StObject.set(x, "XX", js.undefined)
    }
  }
}
