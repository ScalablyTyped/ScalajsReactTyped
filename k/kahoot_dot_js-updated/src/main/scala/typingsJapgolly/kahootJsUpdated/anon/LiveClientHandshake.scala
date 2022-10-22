package typingsJapgolly.kahootJsUpdated.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.kahootJsUpdated.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveClientHandshake extends StObject {
  
  var LiveClientHandshake: Instantiable3[
    /* number */ String | Double, 
    /* message */ L, 
    /* client */ ^, 
    typingsJapgolly.kahootJsUpdated.srcAssetsLiveClientHandshakeMod.^
  ]
  
  var LiveJoinPacket: Instantiable2[
    /* client */ ^, 
    /* name */ js.UndefOr[String], 
    typingsJapgolly.kahootJsUpdated.srcAssetsLiveJoinPacketMod.^
  ]
  
  var LiveJoinTeamPacket: Instantiable2[
    /* client */ ^, 
    /* team */ js.Array[String], 
    typingsJapgolly.kahootJsUpdated.srcAssetsLiveJoinTeamPacketMod.^
  ]
  
  var LiveLeavePacket: Instantiable1[/* client */ ^, typingsJapgolly.kahootJsUpdated.srcAssetsLiveLeavePacketMod.^]
  
  var LiveTwoStepAnswer: Instantiable2[
    /* client */ ^, 
    /* sequence */ js.Array[Double], 
    typingsJapgolly.kahootJsUpdated.srcAssetsLiveTwoStepAnswerMod.^
  ]
}
object LiveClientHandshake {
  
  inline def apply(
    LiveClientHandshake: Instantiable3[
      /* number */ String | Double, 
      /* message */ L, 
      /* client */ ^, 
      typingsJapgolly.kahootJsUpdated.srcAssetsLiveClientHandshakeMod.^
    ],
    LiveJoinPacket: Instantiable2[
      /* client */ ^, 
      /* name */ js.UndefOr[String], 
      typingsJapgolly.kahootJsUpdated.srcAssetsLiveJoinPacketMod.^
    ],
    LiveJoinTeamPacket: Instantiable2[
      /* client */ ^, 
      /* team */ js.Array[String], 
      typingsJapgolly.kahootJsUpdated.srcAssetsLiveJoinTeamPacketMod.^
    ],
    LiveLeavePacket: Instantiable1[/* client */ ^, typingsJapgolly.kahootJsUpdated.srcAssetsLiveLeavePacketMod.^],
    LiveTwoStepAnswer: Instantiable2[
      /* client */ ^, 
      /* sequence */ js.Array[Double], 
      typingsJapgolly.kahootJsUpdated.srcAssetsLiveTwoStepAnswerMod.^
    ]
  ): LiveClientHandshake = {
    val __obj = js.Dynamic.literal(LiveClientHandshake = LiveClientHandshake.asInstanceOf[js.Any], LiveJoinPacket = LiveJoinPacket.asInstanceOf[js.Any], LiveJoinTeamPacket = LiveJoinTeamPacket.asInstanceOf[js.Any], LiveLeavePacket = LiveLeavePacket.asInstanceOf[js.Any], LiveTwoStepAnswer = LiveTwoStepAnswer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveClientHandshake]
  }
  
  extension [Self <: LiveClientHandshake](x: Self) {
    
    inline def setLiveClientHandshake(
      value: Instantiable3[
          /* number */ String | Double, 
          /* message */ L, 
          /* client */ ^, 
          typingsJapgolly.kahootJsUpdated.srcAssetsLiveClientHandshakeMod.^
        ]
    ): Self = StObject.set(x, "LiveClientHandshake", value.asInstanceOf[js.Any])
    
    inline def setLiveJoinPacket(
      value: Instantiable2[
          /* client */ ^, 
          /* name */ js.UndefOr[String], 
          typingsJapgolly.kahootJsUpdated.srcAssetsLiveJoinPacketMod.^
        ]
    ): Self = StObject.set(x, "LiveJoinPacket", value.asInstanceOf[js.Any])
    
    inline def setLiveJoinTeamPacket(
      value: Instantiable2[
          /* client */ ^, 
          /* team */ js.Array[String], 
          typingsJapgolly.kahootJsUpdated.srcAssetsLiveJoinTeamPacketMod.^
        ]
    ): Self = StObject.set(x, "LiveJoinTeamPacket", value.asInstanceOf[js.Any])
    
    inline def setLiveLeavePacket(
      value: Instantiable1[/* client */ ^, typingsJapgolly.kahootJsUpdated.srcAssetsLiveLeavePacketMod.^]
    ): Self = StObject.set(x, "LiveLeavePacket", value.asInstanceOf[js.Any])
    
    inline def setLiveTwoStepAnswer(
      value: Instantiable2[
          /* client */ ^, 
          /* sequence */ js.Array[Double], 
          typingsJapgolly.kahootJsUpdated.srcAssetsLiveTwoStepAnswerMod.^
        ]
    ): Self = StObject.set(x, "LiveTwoStepAnswer", value.asInstanceOf[js.Any])
  }
}
