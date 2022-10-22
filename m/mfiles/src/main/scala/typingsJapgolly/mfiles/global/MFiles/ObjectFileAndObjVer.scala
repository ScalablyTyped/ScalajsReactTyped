package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IObjectFile
import typingsJapgolly.mfiles.IObjectFileAndObjVer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectFileAndObjVer")
@js.native
open class ObjectFileAndObjVer ()
  extends StObject
     with IObjectFileAndObjVer {
  
  /* CompleteClass */
  override def Clone(): IObjectFileAndObjVer = js.native
  
  /* CompleteClass */
  override val ObjVer: IObjVer = js.native
  
  /* CompleteClass */
  override val ObjectFile: IObjectFile = js.native
  
  /* CompleteClass */
  override def ToJSON(): String = js.native
}
