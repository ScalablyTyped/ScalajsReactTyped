package typingsJapgolly.importMetaResolve

import typingsJapgolly.importMetaResolve.libResolveMod.Format
import typingsJapgolly.importMetaResolve.libResolveMod.PackageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importMetaResolveStrings {
  
  @js.native
  sealed trait commonjs
    extends StObject
       with Format
       with PackageType
  inline def commonjs: commonjs = "commonjs".asInstanceOf[commonjs]
  
  @js.native
  sealed trait module
    extends StObject
       with Format
       with PackageType
  inline def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait none
    extends StObject
       with PackageType
  inline def none: none = "none".asInstanceOf[none]
}
