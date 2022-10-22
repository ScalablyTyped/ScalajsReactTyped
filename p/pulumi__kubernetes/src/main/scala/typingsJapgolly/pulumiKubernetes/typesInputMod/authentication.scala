package typingsJapgolly.pulumiKubernetes.typesInputMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authentication {
  
  object v1 {
    
    /**
      * BoundObjectReference is a reference to an object that a token is bound to.
      */
    trait BoundObjectReference extends StObject {
      
      /**
        * API version of the referent.
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Name of the referent.
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * UID of the referent.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
    }
    object BoundObjectReference {
      
      inline def apply(): BoundObjectReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BoundObjectReference]
      }
      
      extension [Self <: BoundObjectReference](x: Self) {
        
        inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      }
    }
    
    /**
      * BoundObjectReference is a reference to an object that a token is bound to.
      */
    trait BoundObjectReferencePatch extends StObject {
      
      /**
        * API version of the referent.
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Name of the referent.
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * UID of the referent.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
    }
    object BoundObjectReferencePatch {
      
      inline def apply(): BoundObjectReferencePatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BoundObjectReferencePatch]
      }
      
      extension [Self <: BoundObjectReferencePatch](x: Self) {
        
        inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      }
    }
    
    /**
      * TokenRequestSpec contains client provided parameters of a token request.
      */
    trait TokenRequestSpec extends StObject {
      
      /**
        * Audiences are the intendend audiences of the token. A recipient of a token must identify themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
        */
      var audiences: Input[js.Array[Input[String]]]
      
      /**
        * BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
        */
      var boundObjectRef: js.UndefOr[Input[BoundObjectReference]] = js.undefined
      
      /**
        * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
        */
      var expirationSeconds: js.UndefOr[Input[Double]] = js.undefined
    }
    object TokenRequestSpec {
      
      inline def apply(audiences: Input[js.Array[Input[String]]]): TokenRequestSpec = {
        val __obj = js.Dynamic.literal(audiences = audiences.asInstanceOf[js.Any])
        __obj.asInstanceOf[TokenRequestSpec]
      }
      
      extension [Self <: TokenRequestSpec](x: Self) {
        
        inline def setAudiences(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        inline def setAudiencesVarargs(value: Input[String]*): Self = StObject.set(x, "audiences", js.Array(value*))
        
        inline def setBoundObjectRef(value: Input[BoundObjectReference]): Self = StObject.set(x, "boundObjectRef", value.asInstanceOf[js.Any])
        
        inline def setBoundObjectRefUndefined: Self = StObject.set(x, "boundObjectRef", js.undefined)
        
        inline def setExpirationSeconds(value: Input[Double]): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
        
        inline def setExpirationSecondsUndefined: Self = StObject.set(x, "expirationSeconds", js.undefined)
      }
    }
    
    /**
      * TokenRequestSpec contains client provided parameters of a token request.
      */
    trait TokenRequestSpecPatch extends StObject {
      
      /**
        * Audiences are the intendend audiences of the token. A recipient of a token must identify themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
        */
      var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
        */
      var boundObjectRef: js.UndefOr[Input[BoundObjectReferencePatch]] = js.undefined
      
      /**
        * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
        */
      var expirationSeconds: js.UndefOr[Input[Double]] = js.undefined
    }
    object TokenRequestSpecPatch {
      
      inline def apply(): TokenRequestSpecPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TokenRequestSpecPatch]
      }
      
      extension [Self <: TokenRequestSpecPatch](x: Self) {
        
        inline def setAudiences(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
        
        inline def setAudiencesVarargs(value: Input[String]*): Self = StObject.set(x, "audiences", js.Array(value*))
        
        inline def setBoundObjectRef(value: Input[BoundObjectReferencePatch]): Self = StObject.set(x, "boundObjectRef", value.asInstanceOf[js.Any])
        
        inline def setBoundObjectRefUndefined: Self = StObject.set(x, "boundObjectRef", js.undefined)
        
        inline def setExpirationSeconds(value: Input[Double]): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
        
        inline def setExpirationSecondsUndefined: Self = StObject.set(x, "expirationSeconds", js.undefined)
      }
    }
    
    /**
      * TokenReviewSpec is a description of the token authentication request.
      */
    trait TokenReviewSpec extends StObject {
      
      /**
        * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
        */
      var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * Token is the opaque bearer token.
        */
      var token: js.UndefOr[Input[String]] = js.undefined
    }
    object TokenReviewSpec {
      
      inline def apply(): TokenReviewSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TokenReviewSpec]
      }
      
      extension [Self <: TokenReviewSpec](x: Self) {
        
        inline def setAudiences(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
        
        inline def setAudiencesVarargs(value: Input[String]*): Self = StObject.set(x, "audiences", js.Array(value*))
        
        inline def setToken(value: Input[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    /**
      * TokenReviewSpec is a description of the token authentication request.
      */
    trait TokenReviewSpecPatch extends StObject {
      
      /**
        * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
        */
      var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * Token is the opaque bearer token.
        */
      var token: js.UndefOr[Input[String]] = js.undefined
    }
    object TokenReviewSpecPatch {
      
      inline def apply(): TokenReviewSpecPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TokenReviewSpecPatch]
      }
      
      extension [Self <: TokenReviewSpecPatch](x: Self) {
        
        inline def setAudiences(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
        
        inline def setAudiencesVarargs(value: Input[String]*): Self = StObject.set(x, "audiences", js.Array(value*))
        
        inline def setToken(value: Input[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * TokenReviewSpec is a description of the token authentication request.
      */
    trait TokenReviewSpec extends StObject {
      
      /**
        * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
        */
      var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * Token is the opaque bearer token.
        */
      var token: js.UndefOr[Input[String]] = js.undefined
    }
    object TokenReviewSpec {
      
      inline def apply(): TokenReviewSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TokenReviewSpec]
      }
      
      extension [Self <: TokenReviewSpec](x: Self) {
        
        inline def setAudiences(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
        
        inline def setAudiencesVarargs(value: Input[String]*): Self = StObject.set(x, "audiences", js.Array(value*))
        
        inline def setToken(value: Input[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    /**
      * TokenReviewSpec is a description of the token authentication request.
      */
    trait TokenReviewSpecPatch extends StObject {
      
      /**
        * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
        */
      var audiences: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
      /**
        * Token is the opaque bearer token.
        */
      var token: js.UndefOr[Input[String]] = js.undefined
    }
    object TokenReviewSpecPatch {
      
      inline def apply(): TokenReviewSpecPatch = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TokenReviewSpecPatch]
      }
      
      extension [Self <: TokenReviewSpecPatch](x: Self) {
        
        inline def setAudiences(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
        
        inline def setAudiencesVarargs(value: Input[String]*): Self = StObject.set(x, "audiences", js.Array(value*))
        
        inline def setToken(value: Input[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
  }
}
