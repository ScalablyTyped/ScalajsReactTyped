package typingsJapgolly.filesystem

import org.scalajs.dom.File
import typingsJapgolly.filewriter.FileWriterSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface represents a file on a file system.
  */
@js.native
trait FileEntrySync
  extends StObject
     with EntrySync {
  
  /**
    * Creates a new FileWriterSync associated with the file that this FileEntrySync represents.
    */
  def createWriter(): FileWriterSync = js.native
  
  /**
    * Returns a File that represents the current state of the file that this FileEntrySync represents.
    */
  def file(): File = js.native
}
