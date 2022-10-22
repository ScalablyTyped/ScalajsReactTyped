package typingsJapgolly.activexScripting

import typingsJapgolly.activexScripting.Scripting.DriveTypeConst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Scripting {
    
    /** Drive Object */
    @JSGlobal("Scripting.Drive")
    @js.native
    /* private */ open class Drive ()
      extends StObject
         with typingsJapgolly.activexScripting.Scripting.Drive {
      
      /** Get available space */
      /* CompleteClass */
      override val AvailableSpace: Double = js.native
      
      /** Drive letter */
      /* CompleteClass */
      override val DriveLetter: String = js.native
      
      /** Drive type */
      /* CompleteClass */
      override val DriveType: DriveTypeConst = js.native
      
      /** Filesystem type */
      /* CompleteClass */
      override val FileSystem: String = js.native
      
      /** Get drive free space */
      /* CompleteClass */
      override val FreeSpace: Double = js.native
      
      /** Check if disk is available */
      /* CompleteClass */
      override val IsReady: Boolean = js.native
      
      /** Path */
      /* CompleteClass */
      override val Path: String = js.native
      
      /** Root folder */
      /* CompleteClass */
      override val RootFolder: typingsJapgolly.activexScripting.Scripting.Folder = js.native
      
      /* private */ /* CompleteClass */
      @JSName("Scripting.Drive_typekey")
      var ScriptingDotDrive_typekey: typingsJapgolly.activexScripting.Scripting.Drive = js.native
      
      /** Serial number */
      /* CompleteClass */
      override val SerialNumber: Double = js.native
      
      /** Share name */
      /* CompleteClass */
      override val ShareName: String = js.native
      
      /** Get total drive size */
      /* CompleteClass */
      override val TotalSize: Double = js.native
      
      /** Name of volume */
      /* CompleteClass */
      var VolumeName: String = js.native
    }
    
    /** File object */
    @JSGlobal("Scripting.File")
    @js.native
    /* private */ open class File ()
      extends StObject
         with typingsJapgolly.activexScripting.Scripting.File
    
    /** FileSystem Object */
    @JSGlobal("Scripting.FileSystemObject")
    @js.native
    /* private */ open class FileSystemObject ()
      extends StObject
         with typingsJapgolly.activexScripting.Scripting.FileSystemObject
    
    /** Folder object */
    @JSGlobal("Scripting.Folder")
    @js.native
    /* private */ open class Folder ()
      extends StObject
         with typingsJapgolly.activexScripting.Scripting.Folder
    
    /** TextStream object */
    @JSGlobal("Scripting.TextStream")
    @js.native
    /* private */ open class TextStream ()
      extends StObject
         with typingsJapgolly.activexScripting.Scripting.TextStream
  }
}
