package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameSessionConnectionInfo extends StObject {
  
  /**
    * The DNS identifier assigned to the instance that is running the game session. Values have the following format:   TLS-enabled fleets: &lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com.   Non-TLS-enabled fleets: ec2-&lt;unique identifier&gt;.compute.amazonaws.com. (See Amazon EC2 Instance IP Addressing.)   When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP address.
    */
  var DnsName: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.DnsName] = js.undefined
  
  /**
    * A unique identifier for the game session. Use the game session ID.
    */
  var GameSessionArn: js.UndefOr[ArnStringModel] = js.undefined
  
  /**
    * The IP address of the game session. To connect to a GameLift game server, an app needs both the IP address and port number.
    */
  var IpAddress: js.UndefOr[StringModel] = js.undefined
  
  /**
    * A collection of player session IDs, one for each player ID that was included in the original matchmaking request. 
    */
  var MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList] = js.undefined
  
  /**
    * The port number for the game session. To connect to a GameLift game server, an app needs both the IP address and port number.
    */
  var Port: js.UndefOr[PositiveInteger] = js.undefined
}
object GameSessionConnectionInfo {
  
  inline def apply(): GameSessionConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionConnectionInfo]
  }
  
  extension [Self <: GameSessionConnectionInfo](x: Self) {
    
    inline def setDnsName(value: DnsName): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    inline def setGameSessionArn(value: ArnStringModel): Self = StObject.set(x, "GameSessionArn", value.asInstanceOf[js.Any])
    
    inline def setGameSessionArnUndefined: Self = StObject.set(x, "GameSessionArn", js.undefined)
    
    inline def setIpAddress(value: StringModel): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setMatchedPlayerSessions(value: MatchedPlayerSessionList): Self = StObject.set(x, "MatchedPlayerSessions", value.asInstanceOf[js.Any])
    
    inline def setMatchedPlayerSessionsUndefined: Self = StObject.set(x, "MatchedPlayerSessions", js.undefined)
    
    inline def setMatchedPlayerSessionsVarargs(value: MatchedPlayerSession*): Self = StObject.set(x, "MatchedPlayerSessions", js.Array(value*))
    
    inline def setPort(value: PositiveInteger): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
