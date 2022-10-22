package typingsJapgolly.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartGeneratedCodeJobRequest extends StObject {
  
  /**
    * The name of the game.
    */
  var GameName: typingsJapgolly.awsSdk.clientsGamesparksMod.GameName
  
  /**
    * Properties of the generator to use for the job.
    */
  var Generator: typingsJapgolly.awsSdk.clientsGamesparksMod.Generator
  
  /**
    * The identifier of the snapshot for which to generate code.
    */
  var SnapshotId: typingsJapgolly.awsSdk.clientsGamesparksMod.SnapshotId
}
object StartGeneratedCodeJobRequest {
  
  inline def apply(GameName: GameName, Generator: Generator, SnapshotId: SnapshotId): StartGeneratedCodeJobRequest = {
    val __obj = js.Dynamic.literal(GameName = GameName.asInstanceOf[js.Any], Generator = Generator.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartGeneratedCodeJobRequest]
  }
  
  extension [Self <: StartGeneratedCodeJobRequest](x: Self) {
    
    inline def setGameName(value: GameName): Self = StObject.set(x, "GameName", value.asInstanceOf[js.Any])
    
    inline def setGenerator(value: Generator): Self = StObject.set(x, "Generator", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
