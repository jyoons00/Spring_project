/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-12-04 04:03:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class oho_005ffindPwd1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/USER/Desktop/SpringOhora/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ProjectOhora/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1731460991358L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

 String contextPath =
request.getContextPath(); 
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <title>오호라 팀 프로젝트</title>\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"shortcut icon\"\r\n");
      out.write("      type=\"image/x-icon\"\r\n");
      out.write("      href=\"http://localhost/jspPro/images/SiSt.ico\"\r\n");
      out.write("    />\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <meta name=\"google\" content=\"notranslate\" />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Libre+Baskerville&display=swap\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Noto+Sans+KR&display=swap\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\"></div>\r\n");
      out.write("    <span class=\"title\">PASSWORD FIND</span>\r\n");
      out.write("    <span class=\"description\">\r\n");
      out.write("      가입하신 회원 유형에 따라 비밀번호 찾기가 가능합니다.\r\n");
      out.write("    </span>\r\n");
      out.write("    <form\r\n");
      out.write("      class=\"form-container\"\r\n");
      out.write("      id=\"findPwForm\"\r\n");
      out.write("      action=\"/findPwd2.htm\"\r\n");
      out.write("      method=\"post\"\r\n");
      out.write("    >\r\n");
      out.write("      <div class=\"label-container\">\r\n");
      out.write("        <span class=\"label-text\">회원유형</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <select class=\"dropdown-select\" name=\"membership_type\">\r\n");
      out.write("        <option value=\"개인회원\">개인회원</option>\r\n");
      out.write("        <option value=\"개인사업자 회원\">개인사업자 회원</option>\r\n");
      out.write("        <option value=\"법인사업자 회원\">법인사업자 회원</option>\r\n");
      out.write("        <option value=\"외국인 회원\">외국인 회원</option>\r\n");
      out.write("      </select>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"radio-group\">\r\n");
      out.write("        <input\r\n");
      out.write("          type=\"radio\"\r\n");
      out.write("          id=\"email\"\r\n");
      out.write("          name=\"contact_method\"\r\n");
      out.write("          value=\"email\"\r\n");
      out.write("          checked=\"checked\"\r\n");
      out.write("        />\r\n");
      out.write("        <label for=\"email\" class=\"radio-label\">이메일</label>\r\n");
      out.write("        <input type=\"radio\" id=\"phone\" name=\"contact_method\" value=\"phone\" />\r\n");
      out.write("        <label for=\"phone\" class=\"radio-label\">휴대폰번호</label>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"label-container\" style=\"top: 95px\">\r\n");
      out.write("        <span class=\"label-text\">아이디</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <input\r\n");
      out.write("        type=\"text\"\r\n");
      out.write("        class=\"input-field\"\r\n");
      out.write("        style=\"top: 95px\"\r\n");
      out.write("        name=\"userLoginId\"\r\n");
      out.write("        value=\"check\"\r\n");
      out.write("      />\r\n");
      out.write("\r\n");
      out.write("      <div class=\"label-container\" style=\"top: 135px\">\r\n");
      out.write("        <span class=\"label-text\">이름</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <input\r\n");
      out.write("        type=\"text\"\r\n");
      out.write("        class=\"input-field\"\r\n");
      out.write("        style=\"top: 135px\"\r\n");
      out.write("        name=\"userName\"\r\n");
      out.write("        value=\"일지매\"\r\n");
      out.write("      />\r\n");
      out.write("\r\n");
      out.write("      <div class=\"label-container\" id=\"findByEmail\" style=\"top: 175px\">\r\n");
      out.write("        <span class=\"label-text\">이메일로 찾기</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <input\r\n");
      out.write("        type=\"text\"\r\n");
      out.write("        class=\"input-field\"\r\n");
      out.write("        id=\"emailInput\"\r\n");
      out.write("        style=\"top: 175px\"\r\n");
      out.write("        name=\"userEmail\"\r\n");
      out.write("        value=\"check@naver.com\"\r\n");
      out.write("      />\r\n");
      out.write("\r\n");
      out.write("      <div\r\n");
      out.write("        class=\"label-container\"\r\n");
      out.write("        id=\"findByPhone\"\r\n");
      out.write("        style=\"top: 175px; display: none\"\r\n");
      out.write("      >\r\n");
      out.write("        <span class=\"label-text\">휴대폰번호로 찾기</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <input\r\n");
      out.write("        type=\"text\"\r\n");
      out.write("        class=\"input-field\"\r\n");
      out.write("        id=\"phoneInput\"\r\n");
      out.write("        style=\"top: 175px; display: none\"\r\n");
      out.write("        name=\"userTel\"\r\n");
      out.write("        value=\"010-4321-4321\"\r\n");
      out.write("      />\r\n");
      out.write("\r\n");
      out.write("      <div class=\"button-container\" id=\"findBtn\">\r\n");
      out.write("        <button type=\"submit\" class=\"button-text\">확인</button>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <input\r\n");
      out.write("        type=\"hidden\"\r\n");
      out.write("        name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("      />\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("      document.getElementById(\"email\").addEventListener(\"change\", function () {\r\n");
      out.write("        if (this.checked) {\r\n");
      out.write("          // 이메일 선택 시 이메일 관련 항목 보이기\r\n");
      out.write("          document.getElementById(\"findByEmail\").style.display = \"block\";\r\n");
      out.write("          document.getElementById(\"emailInput\").style.display = \"block\";\r\n");
      out.write("\r\n");
      out.write("          // 휴대폰 번호 관련 항목 숨기기\r\n");
      out.write("          document.getElementById(\"findByPhone\").style.display = \"none\";\r\n");
      out.write("          document.getElementById(\"phoneInput\").style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("          // 이메일 필드에 값이 있으면 유지하고, 전화번호 입력 필드는 초기화\r\n");
      out.write("          document.getElementById(\"phoneInput\").value = \"\";\r\n");
      out.write("        }\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      document.getElementById(\"phone\").addEventListener(\"change\", function () {\r\n");
      out.write("        if (this.checked) {\r\n");
      out.write("          // 휴대폰 번호 선택 시 휴대폰 관련 항목 보이기\r\n");
      out.write("          document.getElementById(\"findByEmail\").style.display = \"none\";\r\n");
      out.write("          document.getElementById(\"emailInput\").style.display = \"none\";\r\n");
      out.write("\r\n");
      out.write("          // 이메일 관련 항목 숨기기\r\n");
      out.write("          document.getElementById(\"findByPhone\").style.display = \"block\";\r\n");
      out.write("          document.getElementById(\"phoneInput\").style.display = \"block\";\r\n");
      out.write("\r\n");
      out.write("          // 이메일 필드에 값이 있으면 초기화\r\n");
      out.write("          document.getElementById(\"emailInput\").value = \"\";\r\n");
      out.write("        }\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      // 폼 제출 시 사용하지 않는 입력값 초기화\r\n");
      out.write("      document\r\n");
      out.write("        .getElementById(\"findPwForm\")\r\n");
      out.write("        .addEventListener(\"submit\", function (event) {\r\n");
      out.write("          const emailSelected = document.getElementById(\"email\").checked;\r\n");
      out.write("\r\n");
      out.write("          // 이메일 선택 시 휴대폰 번호 입력값 초기화\r\n");
      out.write("          if (emailSelected) {\r\n");
      out.write("            document.getElementById(\"phoneInput\").value = \"\"; // 휴대폰 입력값 초기화\r\n");
      out.write("          } else {\r\n");
      out.write("            // 휴대폰 선택 시 이메일 입력값 초기화\r\n");
      out.write("            document.getElementById(\"emailInput\").value = \"\"; // 이메일 입력값 초기화\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("      //이메일 체크 함수\r\n");
      out.write("      function checkEmail(email) {\r\n");
      out.write("        // 정규 표현식을 사용하여 이메일 형식 검사\r\n");
      out.write("        const emailPattern = /^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/;\r\n");
      out.write("        return emailPattern.test(email);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      //폰 체크 함수\r\n");
      out.write("      function checkPhone(phone) {\r\n");
      out.write("        // 정규 표현식을 사용하여 폰 (010-xxxx-xxxx) 형식 검사\r\n");
      out.write("        const phonePattern = /^010-\\d{4}-\\d{4}$/;\r\n");
      out.write("        return phonePattern.test(phone);\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("      // 확인 버튼\r\n");
      out.write("      $(\"#findBtn\").on(\"click\", function (event) {\r\n");
      out.write("        // alert(\"test\");\r\n");
      out.write("\r\n");
      out.write("        // 기본 제출 방지\r\n");
      out.write("        event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("        let check = true;\r\n");
      out.write("\r\n");
      out.write("        if ($(\"#email\").is(\":checked\")) {\r\n");
      out.write("          $(\"#emailInput\").prop(\"disabled\", false); // 이메일 입력 필드를 활성화\r\n");
      out.write("\r\n");
      out.write("          // 이메일 유효성 검사\r\n");
      out.write("          let emailVal = $(\"#emailInput\").val();\r\n");
      out.write("          if (!checkEmail(emailVal)) {\r\n");
      out.write("            alert(\"이메일 항목이 이메일 형식이 아닙니다.\");\r\n");
      out.write("            check = false;\r\n");
      out.write("          } // if\r\n");
      out.write("        } else if ($(\"#phone\").is(\":checked\")) {\r\n");
      out.write("          $(\"#phoneInput\").prop(\"disabled\", false); // 전화 입력 필드를 활성화\r\n");
      out.write("\r\n");
      out.write("          // 폰 유효성 검사\r\n");
      out.write("          let phoneVal = $(\"#phoneInput\").val();\r\n");
      out.write("          if (!checkPhone(phoneVal)) {\r\n");
      out.write("            alert(\"휴대전화 항목이 휴대전화 형식이 아닙니다.\");\r\n");
      out.write("            check = false;\r\n");
      out.write("          } // if\r\n");
      out.write("        } // else if\r\n");
      out.write("\r\n");
      out.write("        // 폼을 제출\r\n");
      out.write("        if (check) {\r\n");
      out.write("          $(\"#findPwForm\").submit();\r\n");
      out.write("        } // if\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <!-- 비밀번호 못 찾을 시 alert 창 띄우기 -->\r\n");
      out.write("    <script>\r\n");
      out.write("      $(document).ready(function () {\r\n");
      out.write("        if (\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.fail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" === \"true\") {\r\n");
      out.write("          alert(\"입력하신 정보로 가입 된 회원은 존재하지 않습니다.\");\r\n");
      out.write("        }\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
