package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IFileVer
import typingsJapgolly.mfiles.IObjOrFileVer
import typingsJapgolly.mfiles.IObjVer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjOrFileVer")
@js.native
open class ObjOrFileVer ()
  extends StObject
     with IObjOrFileVer {
  
  /* CompleteClass */
  override def Clone(): IObjOrFileVer = js.native
  
  /* CompleteClass */
  var FileVer: IFileVer = js.native
  
  /* CompleteClass */
  override def IsFile(): Boolean = js.native
  
  /* CompleteClass */
  var ObjVer: IObjVer = js.native
}
