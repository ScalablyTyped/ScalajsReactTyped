package typingsJapgolly.servicenow

import typingsJapgolly.servicenow.servicenow.GlideRecordOperation
import typingsJapgolly.servicenow.servicenow.QueryOperator
import typingsJapgolly.servicenow.servicenow.RestHTTPMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicenowStrings {
  
  @js.native
  sealed trait CONTAINS
    extends StObject
       with QueryOperator
  inline def CONTAINS: CONTAINS = "CONTAINS".asInstanceOf[CONTAINS]
  
  @js.native
  sealed trait DOESNOTCONTAIN
    extends StObject
       with QueryOperator
  inline def DOESNOTCONTAIN: DOESNOTCONTAIN = "DOESNOTCONTAIN".asInstanceOf[DOESNOTCONTAIN]
  
  @js.native
  sealed trait ENDSWITH
    extends StObject
       with QueryOperator
  inline def ENDSWITH: ENDSWITH = "ENDSWITH".asInstanceOf[ENDSWITH]
  
  @js.native
  sealed trait Equalssign
    extends StObject
       with QueryOperator
  inline def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  
  @js.native
  sealed trait ExclamationmarkEqualssign
    extends StObject
       with QueryOperator
  inline def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with QueryOperator
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with QueryOperator
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait IN
    extends StObject
       with QueryOperator
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait INSTANCEOF
    extends StObject
       with QueryOperator
  inline def INSTANCEOF: INSTANCEOF = "INSTANCEOF".asInstanceOf[INSTANCEOF]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with QueryOperator
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with QueryOperator
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait STARTSWITH
    extends StObject
       with QueryOperator
  inline def STARTSWITH: STARTSWITH = "STARTSWITH".asInstanceOf[STARTSWITH]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait basic extends StObject
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait delete
    extends StObject
       with GlideRecordOperation
       with RestHTTPMethods
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait elevated extends StObject
  inline def elevated: elevated = "elevated".asInstanceOf[elevated]
  
  @js.native
  sealed trait get
    extends StObject
       with RestHTTPMethods
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait head
    extends StObject
       with RestHTTPMethods
  inline def head: head = "head".asInstanceOf[head]
  
  @js.native
  sealed trait insert
    extends StObject
       with GlideRecordOperation
  inline def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait options
    extends StObject
       with RestHTTPMethods
  inline def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait patch
    extends StObject
       with RestHTTPMethods
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait post
    extends StObject
       with RestHTTPMethods
  inline def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait put
    extends StObject
       with RestHTTPMethods
  inline def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait update
    extends StObject
       with GlideRecordOperation
  inline def update: update = "update".asInstanceOf[update]
}
