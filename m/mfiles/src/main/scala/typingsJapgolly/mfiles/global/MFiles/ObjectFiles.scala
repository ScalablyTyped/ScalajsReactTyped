package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IObjectFile
import typingsJapgolly.mfiles.IObjectFileComparer
import typingsJapgolly.mfiles.IObjectFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectFiles")
@js.native
open class ObjectFiles ()
  extends StObject
     with IObjectFiles {
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetObjectFileByNameForFileSystem(NameForFileSystem: String): IObjectFile = js.native
  
  /* CompleteClass */
  override def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: String): Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IObjectFile = js.native
  
  /* CompleteClass */
  override def Sort(ObjectFileComparer: IObjectFileComparer): Unit = js.native
  
  /* CompleteClass */
  override def ToJSON(): String = js.native
}
