package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullHelpers {
  
  trait OtherPullDeclsWalker extends StObject {
    
    /* private */ var currentlyWalkingOtherDecls: Any
    
    def walkOtherPullDecls(
      currentDecl: PullDecl,
      otherDecls: js.Array[PullDecl],
      callBack: js.Function1[/* otherDecl */ PullDecl, Unit]
    ): Unit
  }
  object OtherPullDeclsWalker {
    
    inline def apply(
      currentlyWalkingOtherDecls: Any,
      walkOtherPullDecls: (PullDecl, js.Array[PullDecl], js.Function1[/* otherDecl */ PullDecl, Unit]) => Callback
    ): OtherPullDeclsWalker = {
      val __obj = js.Dynamic.literal(currentlyWalkingOtherDecls = currentlyWalkingOtherDecls.asInstanceOf[js.Any], walkOtherPullDecls = js.Any.fromFunction3((t0: PullDecl, t1: js.Array[PullDecl], t2: js.Function1[/* otherDecl */ PullDecl, Unit]) => (walkOtherPullDecls(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[OtherPullDeclsWalker]
    }
    
    extension [Self <: OtherPullDeclsWalker](x: Self) {
      
      inline def setCurrentlyWalkingOtherDecls(value: Any): Self = StObject.set(x, "currentlyWalkingOtherDecls", value.asInstanceOf[js.Any])
      
      inline def setWalkOtherPullDecls(value: (PullDecl, js.Array[PullDecl], js.Function1[/* otherDecl */ PullDecl, Unit]) => Callback): Self = StObject.set(x, "walkOtherPullDecls", js.Any.fromFunction3((t0: PullDecl, t1: js.Array[PullDecl], t2: js.Function1[/* otherDecl */ PullDecl, Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait PullTypeSymbolStructureWalker extends StObject {
    
    def callSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean
    
    def constructSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean
    
    def indexSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean
    
    def memberSymbolWalk(memberSymbol: PullSymbol): Boolean
    
    def signatureParameterWalk(parameterSymbol: PullSymbol): Boolean
    
    def signatureReturnTypeWalk(returnType: PullTypeSymbol): Boolean
  }
  object PullTypeSymbolStructureWalker {
    
    inline def apply(
      callSignatureWalk: PullSignatureSymbol => Boolean,
      constructSignatureWalk: PullSignatureSymbol => Boolean,
      indexSignatureWalk: PullSignatureSymbol => Boolean,
      memberSymbolWalk: PullSymbol => Boolean,
      signatureParameterWalk: PullSymbol => Boolean,
      signatureReturnTypeWalk: PullTypeSymbol => Boolean
    ): PullTypeSymbolStructureWalker = {
      val __obj = js.Dynamic.literal(callSignatureWalk = js.Any.fromFunction1(callSignatureWalk), constructSignatureWalk = js.Any.fromFunction1(constructSignatureWalk), indexSignatureWalk = js.Any.fromFunction1(indexSignatureWalk), memberSymbolWalk = js.Any.fromFunction1(memberSymbolWalk), signatureParameterWalk = js.Any.fromFunction1(signatureParameterWalk), signatureReturnTypeWalk = js.Any.fromFunction1(signatureReturnTypeWalk))
      __obj.asInstanceOf[PullTypeSymbolStructureWalker]
    }
    
    extension [Self <: PullTypeSymbolStructureWalker](x: Self) {
      
      inline def setCallSignatureWalk(value: PullSignatureSymbol => Boolean): Self = StObject.set(x, "callSignatureWalk", js.Any.fromFunction1(value))
      
      inline def setConstructSignatureWalk(value: PullSignatureSymbol => Boolean): Self = StObject.set(x, "constructSignatureWalk", js.Any.fromFunction1(value))
      
      inline def setIndexSignatureWalk(value: PullSignatureSymbol => Boolean): Self = StObject.set(x, "indexSignatureWalk", js.Any.fromFunction1(value))
      
      inline def setMemberSymbolWalk(value: PullSymbol => Boolean): Self = StObject.set(x, "memberSymbolWalk", js.Any.fromFunction1(value))
      
      inline def setSignatureParameterWalk(value: PullSymbol => Boolean): Self = StObject.set(x, "signatureParameterWalk", js.Any.fromFunction1(value))
      
      inline def setSignatureReturnTypeWalk(value: PullTypeSymbol => Boolean): Self = StObject.set(x, "signatureReturnTypeWalk", js.Any.fromFunction1(value))
    }
  }
  
  trait SignatureInfoForFuncDecl extends StObject {
    
    var allSignatures: js.Array[PullSignatureSymbol]
    
    var signature: PullSignatureSymbol
  }
  object SignatureInfoForFuncDecl {
    
    inline def apply(allSignatures: js.Array[PullSignatureSymbol], signature: PullSignatureSymbol): SignatureInfoForFuncDecl = {
      val __obj = js.Dynamic.literal(allSignatures = allSignatures.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureInfoForFuncDecl]
    }
    
    extension [Self <: SignatureInfoForFuncDecl](x: Self) {
      
      inline def setAllSignatures(value: js.Array[PullSignatureSymbol]): Self = StObject.set(x, "allSignatures", value.asInstanceOf[js.Any])
      
      inline def setAllSignaturesVarargs(value: PullSignatureSymbol*): Self = StObject.set(x, "allSignatures", js.Array(value*))
      
      inline def setSignature(value: PullSignatureSymbol): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
