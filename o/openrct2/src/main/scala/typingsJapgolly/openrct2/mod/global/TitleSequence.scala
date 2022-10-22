package typingsJapgolly.openrct2.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleSequence extends StObject {
  
  def addPark(path: String, fileName: String): Unit
  
  /**
    * Creates a new title sequence identical to this one.
    * @param name The name of the new title sequence.
    */
  def clone(name: String): TitleSequence
  
  /**
    * The commands that describe how to play the title sequence.
    */
  var commands: js.Array[TitleSequenceCommand]
  
  /**
    * Deletes this title sequence from disc.
    */
  def delete(): Unit
  
  /**
    * Whether the title sequence is a single file or directory.
    */
  val isDirectory: Boolean
  
  /**
    * Whether the title sequence is currently playing.
    */
  val isPlaying: Boolean
  
  /**
    * Whether or not the title sequence is read-only (e.g. a pre-installed sequence).
    */
  val isReadOnly: Boolean
  
  /**
    * The name of the title sequence.
    */
  var name: String
  
  /**
    * The parks stored within this title sequence.
    */
  val parks: js.Array[TitleSequencePark]
  
  /**
    * The full path of the title sequence.
    */
  val path: String
  
  /**
    * Play the title sequence.
    */
  def play(): Unit
  
  /**
    * The current command the title sequence is on if playing.
    */
  val position: Double | Null
  
  /**
    * Seek to a specific command in the sequence.
    * @param position The index of the command to seek to.
    */
  def seek(position: Double): Unit
  
  /**
    * Stops playing the title sequence.
    */
  def stop(): Unit
}
object TitleSequence {
  
  inline def apply(
    addPark: (String, String) => Callback,
    clone_ : String => TitleSequence,
    commands: js.Array[TitleSequenceCommand],
    delete: Callback,
    isDirectory: Boolean,
    isPlaying: Boolean,
    isReadOnly: Boolean,
    name: String,
    parks: js.Array[TitleSequencePark],
    path: String,
    play: Callback,
    seek: Double => Callback,
    stop: Callback
  ): TitleSequence = {
    val __obj = js.Dynamic.literal(addPark = js.Any.fromFunction2((t0: String, t1: String) => (addPark(t0, t1)).runNow()), commands = commands.asInstanceOf[js.Any], delete = delete.toJsFn, isDirectory = isDirectory.asInstanceOf[js.Any], isPlaying = isPlaying.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parks = parks.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], play = play.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), stop = stop.toJsFn, position = null)
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[TitleSequence]
  }
  
  extension [Self <: TitleSequence](x: Self) {
    
    inline def setAddPark(value: (String, String) => Callback): Self = StObject.set(x, "addPark", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setClone_(value: String => TitleSequence): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    inline def setCommands(value: js.Array[TitleSequenceCommand]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: TitleSequenceCommand*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "delete", value.toJsFn)
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParks(value: js.Array[TitleSequencePark]): Self = StObject.set(x, "parks", value.asInstanceOf[js.Any])
    
    inline def setParksVarargs(value: TitleSequencePark*): Self = StObject.set(x, "parks", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
